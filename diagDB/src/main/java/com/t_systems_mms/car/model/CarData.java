package com.t_systems_mms.car.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 29.10.13
 * Time: 09:01
 */
@Entity
public class CarData {
    @Id
    private Long id;
    @OneToOne
    private Inspection lastService;
    @OneToMany(mappedBy = "id",cascade = CascadeType.REMOVE)
    private List<TelemetryData> telemetryData;

    public List<TelemetryData> getTelemetryData() {
        return telemetryData;
    }

    public void setTelemetryData(List<TelemetryData> telemetryData) {
        this.telemetryData = telemetryData;
    }

    public Inspection getLastService() {
        return lastService;
    }

    public void setLastService(Inspection lastService) {
        this.lastService = lastService;
    }
}
