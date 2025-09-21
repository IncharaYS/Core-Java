package com.xworkz.hospitalapp.impl;

import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.hospital.HospitalRules;
import com.xworkz.hospitalapp.patient.Patient;
import com.xworkz.hospitalapp.validator.PatientValidator;

public class HospitalImpl implements HospitalRules {


    public HospitalImpl(int size) {
        this.patients = new Patient[size];
    }

    public Patient[] patients;
    public int index;

    @Override
    public boolean addPatient(Patient patient) {
        boolean isPatientAdded = false;
        boolean isPatientInfoValid = false;

        PatientValidator patientValidator = new PatientValidator();
        if (patientValidator.validatePatientInfo(patient)) {
            isPatientInfoValid = true;
            patients[index++] = patient;
            isPatientAdded = true;
        }
        return isPatientAdded;
    }

    @Override
    public boolean updateNameById(int existingId,String updatedName) {
        boolean isNameUpdated=false;
        for(Patient patient:this.patients) {
            if(patient.getPatientId()==existingId) {
                patient.setName(updatedName);
                isNameUpdated=true;
                System.out.println("Name of patient "+patient.getPatientId()+" updated to:"+patient.getName());
            }
            if(!isNameUpdated) System.out.println("Patient Id "+existingId+" does not exist");
        }
        return isNameUpdated;
    }

    @Override
    public boolean updateGenderById(int existingId,Gender updatedGender) {
        boolean isGenderUpdated=false;
        for(Patient patient:this.patients) {
            if(patient.getPatientId()==existingId) {
                patient.setGender(updatedGender);
                isGenderUpdated=true;
                System.out.println("Gender of patient "+patient.getPatientId()+" updated to:"+patient.getGender());
            }
            if (!isGenderUpdated) System.out.println("Patient Id "+existingId+" does not exist");
        }
        return isGenderUpdated;
    }

    @Override
    public boolean updatePhoneNoById(int existingId,long updatedPhoneNo) {
        boolean isPhoneNoUpdated=false;
        for(Patient patient:this.patients) {
            if(patient.getPatientId()==existingId) {
                patient.setPhoneNo(updatedPhoneNo);
                isPhoneNoUpdated=true;
                System.out.println("Phone no of patient "+patient.getPatientId()+" updated to:"+patient.getPhoneNo());
            }
            if (!isPhoneNoUpdated) System.out.println("Patient Id "+existingId+" does not exist");
        }
        return isPhoneNoUpdated;
    }

    @Override
    public boolean updateModeOfPaymentById(int existingId,String updatedModeOfPayment) {
        boolean isModeOfPaymentUpdated=false;
        for(Patient patient:this.patients) {
            if(patient.getPatientId()==existingId) {
                patient.setModeOfPayment(updatedModeOfPayment);
                isModeOfPaymentUpdated=true;
                System.out.println("Mode of payment of patient "+patient.getPatientId()+" updated to:"+patient.getModeOfPayment());
            }
            if(!isModeOfPaymentUpdated) System.out.println("Patient Id "+existingId+" does not exist");
        }
        return isModeOfPaymentUpdated;
    }

    @Override
    public boolean updateBillAmountById(int existingId,double updatedBillAmount) {
        boolean isBillAmountUpdated = false;
        for(Patient patient:this.patients) {
            if(patient.getPatientId()==existingId) {
                patient.setBillAmount(updatedBillAmount);
                isBillAmountUpdated=true;
                System.out.println("Bill amount of patient "+patient.getPatientId()+" updated to:"+patient.getBillAmount());
            }
            if(!isBillAmountUpdated) System.out.println("Patient Id "+existingId+" does not exist");
        }
        return isBillAmountUpdated;
    }


    @Override
    public String getNameById(int existingPatientId) {
        boolean isIdFound=false;
        for(Patient patient:patients) {
            if(patient.getPatientId()==existingPatientId) {
                isIdFound=true;
                return patient.getName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public Gender getGenderById(int existingPatientId) {
        boolean isIdFound=false;
        for(Patient patient:patients) {
            if (patient.getPatientId()==existingPatientId) {
                isIdFound=true;
                return patient.getGender();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public long getPhoneNoById(int existingPatientId) {
        boolean isIdFound=false;
        for(Patient patient : patients) {
            if(patient.getPatientId()==existingPatientId) {
                isIdFound=true;
                return patient.getPhoneNo();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    @Override
    public String getModeOfPaymentById(int existingPatientId) {
        boolean isIdFound=false;
        for(Patient patient:patients) {
            if(patient.getPatientId()==existingPatientId) {
                isIdFound = true;
                return patient.getModeOfPayment();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public double getBillAmountById(int existingPatientId) {
        boolean isIdFound=false;
        for(Patient patient:patients) {
            if (patient.getPatientId()==existingPatientId) {
                isIdFound = true;
                return patient.getBillAmount();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    @Override
    public Gender getGenderByName(String existingName) {
        boolean isNameFound=false;
        for(Patient patient:patients) {
            if(patient.getName().equals(existingName)) {
                isNameFound=true;
                return patient.getGender();
            }
        }
        System.out.println("Patient name entered not found");
        return null;
    }

    @Override
    public void deletePatientByName(String name) {
        boolean isDeleted=false;
        for(int i=0;i<patients.length;i++) {
            if(patients[i]!=null&&patients[i].getName().equals(name)) {
                for(int j=i;j<patients.length-1;j++) {
                    patients[j]=patients[j+1];
                }
                patients[patients.length-1]=null;
                System.out.println("Patient with name "+name+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if (!isDeleted) System.out.println("No patient with name " + name + " is found");
    }

    @Override
    public void deletePatientById(int id) {
        boolean isDeleted=false;
        for(int i=0;i<patients.length;i++) {
            if(patients[i]!=null&&patients[i].getPatientId()==id) {
                for(int j=i;j<patients.length-1;j++) {
                    patients[j]=patients[j+1];
                }
                patients[patients.length-1] = null;
                System.out.println("Patient with id "+id+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if (!isDeleted) System.out.println("No patient with id "+id+" is found");
    }


    @Override
    public Patient getPatientById(int existingId){
        Patient patient=null;
        for(Patient pro:patients){
            if(pro.getPatientId()==existingId){
                patient=pro;
                System.out.println("Patient details are:");
                getPatientDetails(pro);
            }
        }
        return patient;
    }

    @Override
    public void getPatientDetails(Patient patient){
        if (patient != null) {
            System.out.println("Patient Id is:" + patient.getPatientId());
            System.out.println("Patient Name is:" + patient.getName());
            System.out.println("Patient gender is:" + patient.getGender());
            System.out.println("Patient phone no is:" + patient.getPhoneNo());
            System.out.println("Patient mode of payment is:" + patient.getModeOfPayment());
            System.out.println("Patient bill amount is:" + patient.getBillAmount());
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println("No patient found");
            System.out.println("---------------------------------------------------");
        }
    }

    @Override
    public void getPatientInfo() {
        System.out.println("Patient details are:");
        for (Patient patient : patients) {
            if (patient != null) {
                System.out.println("Patient Id is:" + patient.getPatientId());
                System.out.println("Patient Name is:" + patient.getName());
                System.out.println("Patient gender is:" + patient.getGender());
                System.out.println("Patient phone no is:" + patient.getPhoneNo());
                System.out.println("Patient mode of payment is:" + patient.getModeOfPayment());
                System.out.println("Patient bill amount is:" + patient.getBillAmount());
                System.out.println("---------------------------------------------------");
            } else {
                System.out.println("No patient found");
                System.out.println("---------------------------------------------------");
            }
        }
    }
}

