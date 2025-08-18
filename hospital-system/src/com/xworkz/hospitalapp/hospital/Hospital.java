package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class Hospital {
    Patient patient;
    public boolean addPatient(Patient patient){
        boolean isPatientAdded=false;
        boolean isPatientInfoValid=false;

        PatientValidator patientValidator=new PatientValidator();
        if(patientValidator.validatePatientInfo(patient)){
            isPatientInfoValid=true;
            this.patient=patient;
            isPatientAdded=true;
        }
        return isPatientAdded;
    }
    public void getPatientInfo(){
        System.out.println("Patient Id is:"+this.patient.getPatientId());
        System.out.println("Patient Name is:"+this.patient.getName());
        System.out.println("Patient gender is:"+this.patient.getGender());
        System.out.println("Patient phone no is:"+this.patient.getPhoneNo());
        System.out.println("Patient mode of payment is:"+this.patient.getModeOfPayment());
        System.out.println("Patient bill amount is:"+this.patient.getBillAmount());
    }
}
