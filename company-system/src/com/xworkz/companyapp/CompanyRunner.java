package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        Project project=new Project();
        project.setProjectId(1);
        project.setBudget(20000000.00);
        project.setProjectName("Banking UPI");
        project.setDomain("Banking");
        project.setType("Software development");
        project.setNoOfMembers(18);

        Company company=new Company();
        if(company.addProject(project)) company.getProjectInfo();
        else System.out.println("Project is not added");
    }
}
