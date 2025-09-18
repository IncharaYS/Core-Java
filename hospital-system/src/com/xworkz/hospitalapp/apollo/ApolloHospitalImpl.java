package com.xworkz.hospitalapp.apollo;

import com.xworkz.hospitalapp.impl.Hospital;

public class ApolloHospitalImpl implements Hospital {
    @Override
    public void admitPatient() {
        System.out.println("Patient is admitted");
    }

    @Override
    public void treatPatient() {
        System.out.println("Patient is treated");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Discharge patient");
    }
}
