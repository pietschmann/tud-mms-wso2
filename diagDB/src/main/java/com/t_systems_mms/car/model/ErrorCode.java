package com.t_systems_mms.car.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 19.11.13
 * Time: 15:55
 */
@Entity
public class ErrorCode {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    private Long code;
    private String decription;
}
