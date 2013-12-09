package com.t_systems_mms.car.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author rlu
 * @version 1.0
 * @created 08-Nov-2013 15:15:16
 */
@Entity
public class CarType {

    @Id
	private Long id;
    @OneToOne
    private Range brakeTemperatureRange;
    @OneToOne
    private Range coolantRange;
    @OneToOne
    private Range engineTemperatureRange;
    @OneToOne
    private Range oilTemperaturRange;

    public Range getBrakeTemperatureRange() {
        return brakeTemperatureRange;
    }

    public void setBrakeTemperatureRange(Range brakeTemperatureRange) {
        this.brakeTemperatureRange = brakeTemperatureRange;
    }

    public Range getCoolantRange() {
        return coolantRange;
    }

    public void setCoolantRange(Range coolantRange) {
        this.coolantRange = coolantRange;
    }

    public Range getEngineTemperatureRange() {
        return engineTemperatureRange;
    }

    public void setEngineTemperatureRange(Range engineTemperatureRange) {
        this.engineTemperatureRange = engineTemperatureRange;
    }

    public Range getOilTemperaturRange() {
        return oilTemperaturRange;
    }

    public void setOilTemperaturRange(Range oilTemperaturRange) {
        this.oilTemperaturRange = oilTemperaturRange;
    }
}