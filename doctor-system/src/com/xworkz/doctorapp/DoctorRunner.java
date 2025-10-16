package com.xworkz.doctorapp;

import com.xworkz.doctorapp.doctor.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorRunner {
    public static void main(String[] args) {
        List<Doctor> doctorList = new ArrayList<>();

        doctorList.add(new Doctor("1","Dr. Ramesh","Cardiologist",15,1200.0,true));
        doctorList.add(new Doctor("2","Dr. Suresh","Dermatologist",10,800.0,true));
        doctorList.add(new Doctor("3","Dr. Anil","Neurologist",20,1500.0,true));
        doctorList.add(new Doctor("4","Dr. Priya","Gynecologist",12,1000.0,true));
        doctorList.add(new Doctor("5","Dr. Meera","Pediatrician",8,900.0,true));
        doctorList.add(new Doctor("6","Dr. Vikram","Orthopedic",18,1300.0,true));
        doctorList.add(new Doctor("7","Dr. Kiran","ENT",7,700.0,true));
        doctorList.add(new Doctor("8","Dr. Rohan","Ophthalmologist",14,1100.0,true));
        doctorList.add(new Doctor("9","Dr. Ananya","Psychiatrist",11,950.0,true));
        doctorList.add(new Doctor("10","Dr. Arjun","General Physician",16,1200.0,true));

        System.out.println("Doctor list 1:");
        for(Doctor doctor:doctorList){
            System.out.println(doctor);
        }
        System.out.println();
        System.out.println("Size of Doctor list 1:"+doctorList.size());

        List<Doctor> doctorList2 = new ArrayList<>();

        doctorList2.add(new Doctor("11","Dr. Sneha","Cardiologist",13,1250.0,true));
        doctorList2.add(new Doctor("12","Dr. Ravi","Dermatologist",9,850.0,true));
        doctorList2.add(new Doctor("13","Dr. Swati","Neurologist",17,1400.0,true));
        doctorList2.add(new Doctor("14","Dr. Deepak","Gynecologist",10,1000.0,true));
        doctorList2.add(new Doctor("15","Dr. Nisha","Pediatrician",6,750.0,true));
        doctorList2.add(new Doctor("16","Dr. Mohan","Orthopedic",15,1300.0,true));
        doctorList2.add(new Doctor("17","Dr. Kavya","ENT",8,800.0,true));
        doctorList2.add(new Doctor("18","Dr. Harsh","Ophthalmologist",12,1050.0,true));
        doctorList2.add(new Doctor("19","Dr. Tara","Psychiatrist",10,950.0,true));
        doctorList2.add(new Doctor("20","Dr. Sameer","General Physician",14,1200.0,true));

        System.out.println("Doctor list 2:");
        for(Doctor doctor:doctorList2){
            System.out.println(doctor);
        }
        System.out.println();
        System.out.println("Size of Doctor list 2:"+doctorList2.size());

        doctorList.addAll(doctorList2);
        System.out.println("Full doctor list:");
        for(Doctor doctor:doctorList){
            System.out.println(doctor);
        }
        System.out.println();

        Doctor doctor1 = new Doctor("6","Dr. Vikram","Orthopedic",18,1300.0,true);
        Doctor doctor2 = new Doctor("21","Dr. Rhea","Cardiologist",9,1500.0,true);
        doctorList.add(4,doctor2);

        System.out.println("Does list contain doctor1:"+doctorList.contains(doctor1));
        System.out.println("Does list contain doctorList2:"+doctorList.containsAll(doctorList2));
        System.out.println();

        doctorList.remove(doctor1);
        doctorList.remove(7);

        System.out.println("Doctor list after remove(Object) and remove(index):");
        for(Doctor doctor:doctorList){
            System.out.println(doctor);
        }
        System.out.println();

        doctorList.removeAll(doctorList2);
        System.out.println("Doctor list after removing doctorList2:");
        for(Doctor doctor:doctorList){
            System.out.println(doctor);
        }
        System.out.println();

        System.out.println("Does list contain doctor1:"+doctorList.contains(doctor1));
        System.out.println("Does list contain doctorList2:"+doctorList.containsAll(doctorList2));
        System.out.println();

        doctorList.addAll(doctorList2);
        doctorList.retainAll(doctorList2);

        System.out.println("Doctor list after retaining only doctorList2:");
        for(Doctor doctor:doctorList){
            System.out.println(doctor);
        }
        System.out.println();
    }
}

