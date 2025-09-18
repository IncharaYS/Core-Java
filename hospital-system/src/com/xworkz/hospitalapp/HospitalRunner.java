package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.apollo.ApolloHospitalImpl;
import com.xworkz.hospitalapp.impl.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital=new ApolloHospitalImpl();
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.treatPatient();
    }
}
