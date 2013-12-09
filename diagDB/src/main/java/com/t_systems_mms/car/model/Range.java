package com.t_systems_mms.car.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rlu
 * @version 1.0
 * @created 08-Nov-2013 15:15:43
 */
@Entity
public class Range {

    @Id
	private Long id;
    private Double lower;
	private Double upper;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLower() {
        return lower;
    }

    public void setLower(Double lower) {
        this.lower = lower;
    }

    public Double getUpper() {
        return upper;
    }

    public void setUpper(Double upper) {
        this.upper = upper;
    }
}