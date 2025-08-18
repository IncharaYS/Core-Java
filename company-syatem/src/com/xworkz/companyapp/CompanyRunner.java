package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Company company1=new Company();
        company1.setCompanyId(1);
        company1.setName("IBM");
        company1.setDomain("Tech");
        company1.setNoOfEmployees(124000);

        System.out.println("Company ID is: "+company1.getCompanyId());

        System.out.println("main ended");
    }
}
