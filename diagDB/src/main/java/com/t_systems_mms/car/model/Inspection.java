package com.t_systems_mms.car.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 29.10.13
 * Time: 09:03
 */
@Entity
public class Inspection {

    @Id
    private Long id;
    private Date date;
    private Long km;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getKm() {
        return km;
    }

    public void setKm(Long km) {
        this.km = km;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
