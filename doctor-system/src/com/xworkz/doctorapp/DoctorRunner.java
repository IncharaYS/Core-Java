package com.xworkz.doctorapp;

import com.xworkz.doctorapp.doctor.Doctor;

public class DoctorRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Doctor doctor1=new Doctor();
        doctor1.setDoctorId(1);
        doctor1.setEducation("MBBS");
        doctor1.setAge(45);
        doctor1.setSpecialization("General physician");
        doctor1.setName("Sanika");

        System.out.println("Doctor ID is: "+doctor1.getDoctorId());
        System.out.println("Doctor name is: "+doctor1.getName());
        System.out.println("Doctor specialization is: "+doctor1.getSpecialization());
        System.out.println("Doctor education is: "+doctor1.getEducation());
        System.out.println("Doctor age is: "+doctor1.getAge());

        System.out.println("main ended");
    }
}
