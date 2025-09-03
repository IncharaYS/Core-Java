package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient1=new Patient();
        patient1.setPatientId(1);
        patient1.setGender("Male");
        patient1.setName("Sudheer");
        patient1.setPhoneNo(8965432986L);
        patient1.setBillAmount(23000.00);
        patient1.setModeOfPayment("Credit card");

        Hospital hospital=new Hospital();
        hospital.addPatient(patient1);

        Patient patient2=new Patient(2,"Inchara Y S","Female",9872847898L,"Cash",5700.00);
        hospital.addPatient(patient2);

        Patient patient3=new Patient(3,"Rashmi M","Female",9876379075L,"Credit carrd",7000.00);
        hospital.addPatient(patient3);

        /*if(hospital.addPatient(patient)) hospital.getPatientInfo();
        else System.out.println("Patient is not created");*/

        hospital.getPatientInfo();
    }
}
