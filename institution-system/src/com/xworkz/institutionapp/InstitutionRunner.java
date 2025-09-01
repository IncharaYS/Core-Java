package com.xworkz.institutionapp;

import com.xworkz.institutionapp.institution.Institution;
import com.xworkz.institutionapp.xworkz.Xworkz;

public class InstitutionRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Institution institution=new Xworkz();
        institution.institution();
        System.out.println("main ended");
    }
}
