package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class Hospital {
    Patient[] patients=new  Patient[3];
    int index;

    public boolean addPatient(Patient patient){
        boolean isPatientAdded=false;
        boolean isPatientInfoValid=false;

        PatientValidator patientValidator=new PatientValidator();
        if(patientValidator.validatePatientInfo(patient)){
            isPatientInfoValid=true;
            patients[index++]=patient;
            isPatientAdded=true;
        }
        return isPatientAdded;
    }
    public void getPatientInfo() {
        for (Patient patient : patients) {
            System.out.println("Patient Id is:" +patient.getPatientId());
            System.out.println("Patient Name is:" +patient.getName());
            System.out.println("Patient gender is:" +patient.getGender());
            System.out.println("Patient phone no is:" +patient.getPhoneNo());
            System.out.println("Patient mode of payment is:" +patient.getModeOfPayment());
            System.out.println("Patient bill amount is:" +patient.getBillAmount()+"\n");
        }
    }
}
