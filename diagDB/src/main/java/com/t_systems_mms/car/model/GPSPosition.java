package com.t_systems_mms.car.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 29.10.13
 * Time: 09:13
 */
@Entity
public class GPSPosition {
    @Id
    private Long id;
    private Double hight;
    private Integer gkright;

    public Double getHight() {
        return hight;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }

    public Integer getGkright() {
        return gkright;
    }

    public void setGkright(Integer gkright) {
        this.gkright = gkright;
    }

    public Integer getGkhigh() {
        return gkhigh;
    }

    public void setGkhigh(Integer gkhigh) {
        this.gkhigh = gkhigh;
    }

    private Integer gkhigh;


}
