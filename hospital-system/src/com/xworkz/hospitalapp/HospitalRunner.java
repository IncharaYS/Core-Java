package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setGender("Male");
        patient.setName("Sudheer");
        patient.setPhoneNo(8965432986L);
        patient.setBillAmount(23000.00);
        patient.setModeOfPayment("Credit card");

        Hospital hospital=new Hospital();
        if(hospital.addPatient(patient)) hospital.getPatientInfo();
        else System.out.println("Patient is not created");
    }
}
