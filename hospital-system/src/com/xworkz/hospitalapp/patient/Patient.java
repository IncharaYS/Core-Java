package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Patient {
    private int patientId;
    private String name;
    private Gender gender;
    private long phoneNo;
    private String modeOfPayment;
    private double billAmount;

   /* public Patient(){

    }
    public  Patient(int patientId,String name,String gender,long phoneNo,String modeOfPayment,double billAmount){
        this.patientId=patientId;
        this.name=name;
        this.gender=gender;
        this.phoneNo=phoneNo;
        this.modeOfPayment=modeOfPayment;
        this.billAmount=billAmount;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getBillAmount() {
        return billAmount;
    }*/
}
