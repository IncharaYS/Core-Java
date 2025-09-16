package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of patients to add to the hospital:");
        int size=sc.nextInt();
        Hospital hospital=new Hospital(size);

        System.out.println("The total number a patients to be added in hospital is:"+hospital.patients.length);

        for(int i=0;i<hospital.patients.length;i++){
            Patient patient=new Patient();
            System.out.println("Enter details of patient "+(i+1));
            System.out.print("Enter patient ID:");
            patient.setPatientId(sc.nextInt());
            System.out.print("Enter patient name:");sc.nextLine();
            patient.setName(sc.nextLine());
            System.out.print("Enter patient phone number:");
            patient.setPhoneNo(sc.nextLong());
            System.out.print("Enter patient gender:");
            // patient.setGender(Gender.F);
            patient.setGender(Gender.valueOf(sc.next().toUpperCase()));
            System.out.print("Enter mode of payment:");sc.nextLine();
            patient.setModeOfPayment(sc.nextLine());
            System.out.print("Enter bill amount:");
            patient.setBillAmount(sc.nextDouble());
            hospital.addPatient(patient);
            System.out.println("-------------------------------------------------------");
        }
        hospital.getPatientInfo();

        System.out.print("Enter Id of patient to update name:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=hospital.updateNameById(id,sc.nextLine());
        if(isUpdated) System.out.println("Name updated successfully \n");
        else System.out.println("Failed to update name \n");


        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+hospital.getNameById(sc.nextInt()));

        System.out.println("Enter id to get patient details");
        hospital.getPatientById(sc.nextInt());

        System.out.print("Enter patient Id to delete patient info:");
        hospital.deletePatientById(sc.nextInt());

        hospital.getPatientInfo();

       /* Patient patient1=new Patient();
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

        if(hospital.addPatient(patient)) hospital.getPatientInfo();
        else System.out.println("Patient is not created");

        hospital.getPatientInfo();*/
    }
}
