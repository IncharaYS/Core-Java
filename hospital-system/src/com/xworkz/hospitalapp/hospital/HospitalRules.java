package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public interface HospitalRules {
    public boolean addPatient(Patient patient);
    boolean updateNameById(int existingId,String updatedName);
    boolean updateGenderById(int existingId, Gender updatedGender);
    boolean updatePhoneNoById(int existingId,long updatedPhoneNo);
    boolean updateModeOfPaymentById(int existingId,String updatedModeOfPayment);
    boolean updateBillAmountById(int existingId,double updatedBillAmount);
    String getNameById(int existingPatientId);
    Gender getGenderById(int existingPatientId);
    long getPhoneNoById(int existingPatientId);
    String getModeOfPaymentById(int existingPatientId);
    double getBillAmountById(int existingPatientId);
    Gender getGenderByName(String existingName);
    void deletePatientByName(String name);
    public void deletePatientById(int id);
    Patient getPatientById(int existingId);
    void getPatientDetails(Patient patient);
    void getPatientInfo();
}
