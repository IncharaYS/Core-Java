package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.Gender;
import com.xworkz.hospitalapp.patient.Patient;

import java.util.ArrayList;
import java.util.List;

public class HospitalRunner {
    public static void main(String[] args) {
        List<Patient> patientList=new ArrayList<>();

        patientList.add(new Patient(1,"Harsha", Gender.MALE,21,"Bangalore","Fever","B+"));
        patientList.add(new Patient(2,"Inchara Y S",Gender.FEMALE,21,"Bangalore","Viral Fever","O+"));
        patientList.add(new Patient(3,"Sridhar",Gender.MALE,67,"Shimoga","Hypertension","A+"));
        patientList.add(new Patient(4,"Rashmi M",Gender.FEMALE,21,"Bangalore","Anemia","AB+"));
        patientList.add(new Patient(5,"Pannaga",Gender.MALE,26,"Finland","Arthritis","O-"));
        patientList.add(new Patient(6,"Latha",Gender.FEMALE,56,"Shimoga","Thyroid","B-"));
        patientList.add(new Patient(7,"Ravi",Gender.MALE,40,"Hyderabad","Hypertension","A-"));
        patientList.add(new Patient(8,"Gayathri",Gender.FEMALE,54,"Hyderabad","Fever","O+"));
        patientList.add(new Patient(9,"Sumith",Gender.MALE,37,"Bangalore","Fever","B+"));
        patientList.add(new Patient(10,"Kavita",Gender.FEMALE,31,"Bangalore","Viral Fever","AB-"));

        System.out.println("Patient list 1:");
        for(Patient patient:patientList){
            System.out.println(patient);
        }
        System.out.println();

        List<Patient> patientList2 =new ArrayList<>();

        patientList2.add(new Patient(11,"Sudeep",Gender.MALE,50,"Davangere","Allergy","A+"));
        patientList2.add(new Patient(12,"Sana",Gender.FEMALE,24,"Davangere","Allergy","O+"));
        patientList2.add(new Patient(13,"Karan",Gender.MALE,42,"Bangalore","Liver Infection","B-"));
        patientList2.add(new Patient(14,"Pooja",Gender.FEMALE,36,"Mangalore","Skin Infection","AB+"));
        patientList2.add(new Patient(15,"Deepak",Gender.MALE,48,"Bangalore","Kidney Stone","O-"));
        patientList2.add(new Patient(16,"Rashi",Gender.FEMALE,27,"Hassan","Malaria","A+"));
        patientList2.add(new Patient(17,"Harish",Gender.MALE,39,"Bihar","Dengue","B+"));
        patientList2.add(new Patient(18,"Meera",Gender.FEMALE,32,"Bangalore","Fever","O+"));
        patientList2.add(new Patient(19,"Abhishek",Gender.MALE,44,"Shimoga","Kidney stone","AB-"));
        patientList2.add(new Patient(20,"Shreya",Gender.FEMALE,30,"Hyderabad","Fever","A-"));

        System.out.println("Patient list 2:");
        for(Patient patient:patientList2){
            System.out.println(patient);
        }
        System.out.println();

        patientList.addAll(patientList2);
        System.out.println("Patient list:");
        for(Patient patient:patientList){
            System.out.println(patient);
        }
        System.out.println();


        Patient patient1=new Patient(6,"Latha",Gender.FEMALE,56,"Shimoga","Thyroid","B-");
        Patient patient2=new Patient(21,"Savithri",Gender.FEMALE,56,"Shimoga","Thyroid","B-");
        patientList.add(4,patient2);


        System.out.println("Does list contain patient1:"+patientList.contains(patient1));
        System.out.println("Does list contain patientList2:"+patientList.containsAll(patientList2));
        System.out.println();

        patientList.remove(patient1);
        patientList.remove(7);

        System.out.println("Patient list after remove(Object) and remove(index):");
        for(Patient patient:patientList){
            System.out.println(patient);
        }
        System.out.println();

        patientList.removeAll(patientList2);
        System.out.println("Patient list after removing patientList2:");
        for(Patient patient:patientList){
            System.out.println(patient);
        }
        System.out.println();

        System.out.println("Does list contain patient1:"+patientList.contains(patient1));
        System.out.println("Does list contain patientList2:"+patientList.containsAll(patientList2));
        System.out.println();

        patientList.addAll(patientList2);
        patientList.retainAll(patientList2);

        System.out.println("Patient list after retaining only patientList2:");
        for(Patient patient:patientList){
            System.out.println(patient);
        }
        System.out.println();

    }
}
