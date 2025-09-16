package com.xworkz.hospitalapp.validator;

import com.xworkz.hospitalapp.patient.Patient;

public class PatientValidator {
    public boolean validatePatientInfo(Patient patient){
        boolean isPatientValidated=false;
        boolean isPatientIdValid=false;
        boolean isPatientNameValid=false;
        boolean isPatientGenderValid=false;
        boolean isPatientPhoneNoValid=false;
        boolean isPatientModeOfPaymentValid=false;
        boolean isPatientBillAmountValid=false;

        if(patient.getPatientId()>0) isPatientIdValid=true;
        else System.out.println("Patient Id is invalid");

        if(patient.getName()!=null&&!patient.getName().isEmpty()) isPatientNameValid=true;
        else System.out.println("Patient name is not valid");

        if(patient.getPhoneNo()>0) isPatientPhoneNoValid=true;
        else System.out.println("Patient phone no is not valid");

        if (patient.getGender()!=null) isPatientGenderValid=true;
        else System.out.println("Patient gender is not valid");

        if (patient.getModeOfPayment()!=null&&!patient.getModeOfPayment().isEmpty()) isPatientModeOfPaymentValid=true;
        else System.out.println("Entered mode of payment is not valid");

        if (patient.getBillAmount()>0) isPatientBillAmountValid=true;
        else System.out.println("Bill amount entered is not valid");

        if(isPatientIdValid&&isPatientGenderValid&&isPatientBillAmountValid&&isPatientNameValid&&isPatientModeOfPaymentValid&&isPatientPhoneNoValid){
            isPatientValidated=true;
        }

        return isPatientValidated;
    }
}
