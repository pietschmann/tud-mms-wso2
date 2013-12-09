package com.t_systems_mms.car.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 08.11.13
 * Time: 16:42
 */
public class DDLUtil {

    enum Dialect {
        MYSQL("org.hibernate.dialect.MySQLInnoDBDialect"),
        ORACLE("org.unhcr.omss.db.oracle.OracleDialectDeferredFK"),
        SYBASE("org.hibernate.dialect.SybaseAnywhereDialect");

        private String className;

        private Dialect(String className) {
            this.className = className;
        }

        public String getClassName() {
            return className;
        }
    }

    public static void main(String[] args) throws Exception {
        List<Class<?>> classes = getClasses(Thread.currentThread().getContextClassLoader(), "com.t_systems_mms.car.model");
        new DDLUtil().execute(Dialect.MYSQL, classes);
    }


    static List<Class<?>> getClasses(ClassLoader loader, String packageName) throws IOException, ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = loader.getResources(path);
        if (resources != null) {
            while (resources.hasMoreElements()) {
                String filePath = resources.nextElement().getFile();
                // WINDOWS HACK
                if(filePath.indexOf("%20") > 0)
                    filePath = filePath.replaceAll("%20", " ");
                if (filePath != null) {
                    if ((filePath.indexOf("!") > 0) & (filePath.indexOf(".jar") > 0)) {
                        String jarPath = filePath.substring(0, filePath.indexOf("!"))
                                .substring(filePath.indexOf(":") + 1);
                        if (jarPath.indexOf(":") >= 0) jarPath = jarPath.substring(1);
                         classes.addAll(getFromJARFile(jarPath, path));
                    } else {
                        classes.addAll(getFromDirectory(new File(filePath), packageName));
                    }
                }
            }
        }
        return classes;
    }
    static List<Class<?>> getFromDirectory(File directory, String packageName) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        if (directory.exists()) {
            for (String file : directory.list()) {
                if (file.endsWith(".class")) {
                    String name = packageName + '.' + stripFilenameExtension(file);
                    Class<?> clazz = Class.forName(name);
                    classes.add(clazz);
                }
            }
        }
        return classes;
    }
    static Set<Class<?>> getFromJARFile(String jar, String packageName) throws IOException, ClassNotFoundException {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        JarInputStream jarFile = new JarInputStream(new FileInputStream(jar));
        JarEntry jarEntry;
        do {
            jarEntry = jarFile.getNextJarEntry();
            if (jarEntry != null) {
                String className = jarEntry.getName();
                if (className.endsWith(".class")) {
                    className = stripFilenameExtension(className);
                    if (className.startsWith(packageName))
                        classes.add(Class.forName(className.replace('/', '.')));
                }

            }
        } while (jarEntry != null);
        return classes;
    }

    static String stripFilenameExtension(String filename) {
        return filename.substring(0, filename.indexOf('.'));
    }

    private void execute(Dialect dialect, List<Class<?>> classes) {
            AnnotationConfiguration configuration = new AnnotationConfiguration();
            configuration.setProperty(Environment.DIALECT, dialect.getClassName());
            for (Class<?> entityClass : classes) {
                configuration.addAnnotatedClass(entityClass);
            }
            SchemaExport schemaExport = new SchemaExport(configuration);
            schemaExport.setDelimiter(";");
            schemaExport.setOutputFile(String.format("%s_%s.%s ", new Object[] {"ddl", dialect.name().toLowerCase(), "sql" }));
            boolean consolePrint = true;
            boolean exportInDatabase = false;
            schemaExport.create(consolePrint, exportInDatabase);
        }
    }

