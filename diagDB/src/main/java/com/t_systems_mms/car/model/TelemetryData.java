package com.t_systems_mms.car.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 29.10.13
 * Time: 09:04
 */
@Entity
public class TelemetryData {

    @Id
    private Long id;

    private Date date;
    @OneToOne
    private GPSPosition position;
    private Long distance;
    private Double avgSpeed;

    private Double oilPressure;
    private Double oilLevel;
    private Double oilTemperature;
    private Double engineTemperature;
    private Double brakeTemperature;
    private Double coolantTemperature;

    private Long engineSpeed;
    private Long fanSpeed;
    @OneToMany
    private List<Tyre> tyrePressure;
    @OneToMany
    private List<ErrorCode> errorCodes;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public GPSPosition getPosition() {
        return position;
    }

    public void setPosition(GPSPosition position) {
        this.position = position;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(Double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public Double getOilPressure() {
        return oilPressure;
    }

    public void setOilPressure(Double oilPressure) {
        this.oilPressure = oilPressure;
    }

    public Double getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(Double oilLevel) {
        this.oilLevel = oilLevel;
    }

    public Double getOilTemperature() {
        return oilTemperature;
    }

    public void setOilTemperature(Double oilTemperature) {
        this.oilTemperature = oilTemperature;
    }

    public Double getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(Double engineTemperature) {
        this.engineTemperature = engineTemperature;
    }

    public Double getBrakeTemperature() {
        return brakeTemperature;
    }

    public void setBrakeTemperature(Double brakeTemperature) {
        this.brakeTemperature = brakeTemperature;
    }

    public Double getCoolantTemperature() {
        return coolantTemperature;
    }

    public void setCoolantTemperature(Double coolantTemperature) {
        this.coolantTemperature = coolantTemperature;
    }

    public Long getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(Long engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public Long getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(Long fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public List<Tyre> getTyrePressure() {
        return tyrePressure;
    }

    public void setTyrePressure(List<Tyre> tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public List<ErrorCode> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(List<ErrorCode> errorCodes) {
        this.errorCodes = errorCodes;
    }
}
