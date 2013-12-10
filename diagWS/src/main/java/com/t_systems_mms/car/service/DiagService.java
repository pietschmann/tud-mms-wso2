package com.t_systems_mms.car.service;


import com.t_systems_mms.carservice.GetCarDataDocument;
import com.t_systems_mms.carservice.GetCarDataResponseDocument;
import com.t_systems_mms.carservice.SaveTelemetrieDataDocument;
import com.t_systems_mms.carservice.SaveTelemetrieDataResponseDocument;

/**
 * FIXME: was tut diese klasse?
 * User: rlu
 * Date: 10.12.13
 * Time: 11:56
 */
public class DiagService extends DiagServiceServiceSkeleton {

    @Override
    public SaveTelemetrieDataResponseDocument saveTelemetrieData(SaveTelemetrieDataDocument saveTelemetrieData) {
        return super.saveTelemetrieData(saveTelemetrieData);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public GetCarDataResponseDocument getCarData(GetCarDataDocument getCarData) {
        return super.getCarData(getCarData);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
