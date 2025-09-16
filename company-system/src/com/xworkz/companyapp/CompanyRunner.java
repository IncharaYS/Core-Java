package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of projects:");
        int size=sc.nextInt();
        Company company=new Company(size);
        System.out.println("Number of projects to be added are:"+company.projects.length);
        for(int i=0;i<size;i++){
            Project project=new Project();
            System.out.println("Enter the details of project "+(i+1));
            System.out.print("Enter project Id:");
            project.setProjectId(sc.nextInt());
            System.out.print("Enter the project name:");sc.nextLine();
            project.setProjectName(sc.nextLine());
            System.out.print("Enter the project type:");
            project.setType(sc.nextLine());
            System.out.print("Enter the project domain:");
            project.setDomain(Domain.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter the number of members:");
            project.setNoOfMembers(sc.nextInt());
            System.out.print("Enter the budget:");
            project.setBudget(sc.nextDouble());
            company.addProject(project);
            System.out.println("---------------------------------------------");
        }
        company.getProjectInfo();

        System.out.print("Enter Id of project to update name:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=company.updateProjectNameById(id,sc.nextLine());
        if(isUpdated) System.out.println("Name updated successfully \n");
        else System.out.println("Failed to update name \n");


        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+company.getProjectNameById(sc.nextInt()));


        System.out.println("Enter id to get project details");
        company.getProjectById(sc.nextInt());

        System.out.print("Enter the id of project you want to delete:");
        company.deleteProjectById(sc.nextInt());

        company.getProjectInfo();

        /*Project project1=new Project();
        project1.setProjectId(1);
        project1.setBudget(20000000.00);
        project1.setProjectName("Banking UPI");
        project1.setDomain("Banking");
        project1.setType("Software development");
        project1.setNoOfMembers(18);

        Company company=new Company();
        company.addProject(project1);

        Project project2=new Project(2,"Cloud website","Software development","Cload",24,300000.00);
        company.addProject(project2);

        Project project3=new Project(3,"E-commerce Platform","Software development","RetailX",18,1500000.00);
        company.addProject(project3);

        Project project4=new Project(4,"Banking App","Mobile application","FinBank",12,900000.00);
        company.addProject(project4);

        Project project5=new Project(5,"Hospital Management System","Software development","MediCare",20,1200000.00);
        company.addProject(project5);

        Project project6=new Project(6,"Online Learning Portal","Web application","EduTech",15,750000.00);
        company.addProject(project6);

        Project project7=new Project(7,"Inventory Management","ERP solution","MegaMart",10,500000.00);
        company.addProject(project7);

        Project project8=new Project(8,"Hotel Booking App","Mobile application","TravelEase",14,800000.00);
        company.addProject(project8);

        Project project9=new Project(9,"Food Delivery System","Web application","QuickEats",16,950000.00);
        company.addProject(project9);

        Project project10=new Project(10,"Ride Sharing Platform","Mobile application","GoRide",22,2200000.00);
        company.addProject(project10);

        Project project11=new Project(11,"Healthcare Chatbot","AI solution","MediHelp",8,400000.00);
        company.addProject(project11);

        Project project12=new Project(12,"Payroll System","Enterprise software","HRPro",9,600000.00);
        company.addProject(project12);

        Project project13=new Project(13,"Digital Marketing Tool","Web application","MarketBoost",11,550000.00);
        company.addProject(project13);

        Project project14=new Project(14,"Gaming App","Mobile game","FunPlay",7,300000.00);
        company.addProject(project14);

        Project project15=new Project(15,"Online Exam Portal","Web application","TestMaster",12,450000.00);
        company.addProject(project15);

        Project project16=new Project(16,"IoT Smart Home","Embedded app","SmartLiving",24,3500000.00);
        company.addProject(project16);

        Project project17=new Project(17,"Blockchain Wallet","FinTech solution","CryptoSafe",18,1800000.00);
        company.addProject(project17);

        Project project18=new Project(18,"Streaming Service","Mobile app","StreamHub",20,2500000.00);
        company.addProject(project18);

        Project project19=new Project(19,"Retail POS System","Enterprise software","ShopEase",10,700000.00);
        company.addProject(project19);

        Project project20=new Project(20,"Logistics Tracking","IoT application","TransTrack",15,1100000.00);
        company.addProject(project20);

        company.getProjectInfo();
        if(company.addProject(project)) company.getProjectInfo();
        else System.out.println("Project is not added");*/
    }
}
