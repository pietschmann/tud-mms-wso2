package com.t_systems_mms.car.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 29.10.13
 * Time: 09:52
 */
@Entity
public class CarInformation {

    @Id
    private Long id;

    @OneToOne
    private Car car;

    @OneToMany
    private Set<CarData> carDatas;

    public Set<CarData> getCarDatas() {
        return carDatas;
    }

    public void setCarDatas(Set<CarData> carDatas) {
        this.carDatas = carDatas;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
