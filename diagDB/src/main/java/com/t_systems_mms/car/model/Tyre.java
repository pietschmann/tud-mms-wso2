package com.t_systems_mms.car.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 19.11.13
 * Time: 15:56
 */
@Entity
public class Tyre {
    public enum Location {
        FR, FL, RR, RL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Id
    private Long id;

    private Location location;
    private Double pressure;
    private Double temperature;
}
