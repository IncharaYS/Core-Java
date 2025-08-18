package com.xworkz.companyapp.company;

public class Company {
    private int companyId;
    private String name;
    private String domain;
    private int noOfEmployees;

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public String getDomain() {
        return domain;
    }
}
