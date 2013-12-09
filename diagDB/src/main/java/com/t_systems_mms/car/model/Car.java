package com.t_systems_mms.car.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 29.10.13
 * Time: 09:51
 */
@Entity
public class Car {

    private String plateNumber;
    private Date buildDate;
    @Id
    private Long id;
    @ManyToOne
    private CarType type;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Date getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }
}
