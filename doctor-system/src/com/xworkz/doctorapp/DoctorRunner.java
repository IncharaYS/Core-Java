package com.xworkz.doctorapp;

import com.xworkz.doctorapp.surgeon.Surgeon;

public class DoctorRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Surgeon surgeon=new Surgeon();

        System.out.println("main ended");
    }
}
