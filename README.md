tud-mms-wso2
============

Preconditions
 * Download and install JDK 1.7 for your target system
 * Download install Maven 3
 * Download and install preferred database system (tested with mysql 5)

Settings
 - /.m2/settings.xml set following properties 
 -- cardiag.db.url (example: jdbc:mysql://localhost/cardiag) 
 -- cardiag.db.username (must exist in db) 
 -- cardiag.db.password 

Usage:
 1.  https://github.com/pietschmann/tud-mms-wso2] 
     a) -> "Download Zip" -> extract to working directory ${wso2.workdir}. 
     b) git clone https://github.com/pietschmann/tud-mms-wso2
 2. db init
    -  diagDB:
      #% mvn clean install -PinitDB (create initial database)
      #% mvn clean install -PmigrateDB (updates database structur and add test data)
    -- contains all script for initial database setup and example data
    -- also an example excel datasheet is include: attention different structure to db
 3. webservice
    - diagWS:
      #% mvn clean install 
    -- contains 2 wsdl files for webservices
       * carservice.wsdl 
       * diagservice.wsdl
    -- build creates axis based webservice server side skeletons target/generated-sources 
    -- YOUR TODO is now: implement server side classes under src/main/java -> for your guidance see entity classes in carDB/src/main/java
    -- send pull request in github with your results for your colleages
    - diagWSClient: 
      #% mvn clean install 
    -- you can find generated client stub in target/generated-sources
    -- YOUR TODO is now: extend generated classes to implement client side stuff.

Have Fun!
