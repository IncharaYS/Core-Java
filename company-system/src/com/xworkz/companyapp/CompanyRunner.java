package com.xworkz.companyapp;

import com.xworkz.companyapp.impl.CompanyImpl;
import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of projects to add:");
        int size=sc.nextInt();
        CompanyImpl company=new CompanyImpl(size);
        System.out.println("Number of projects to be added is:"+company.projects.length);

        for(int i=0;i<size;i++){
            System.out.println("Enter details of project "+(i+1));
            Project project=new Project();
            System.out.print("Enter project id:");
            project.setProjectId(sc.nextInt());
            System.out.print("Enter project name:"); sc.nextLine();
            project.setProjectName(sc.nextLine());
            System.out.print("Enter project type:");
            project.setType(sc.nextLine());
            System.out.print("Enter project domain:");
            project.setDomain(Domain.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter number of members:");
            project.setNoOfMembers(sc.nextInt());
            System.out.print("Enter project budget:");
            project.setBudget(sc.nextDouble());

            boolean added=company.addProject(project);
            if(!added){
                i--;
            }
            System.out.println("---------------------------------------------------");
            System.out.println(project);
        }

        String input=null;
        do {
            System.out.println("Press 1 to update project name by ID");
            System.out.println("Press 2 to update type by ID");
            System.out.println("Press 3 to update domain by ID");
            System.out.println("Press 4 to update number of members by ID");
            System.out.println("Press 5 to update budget by ID");
            System.out.println("Press 6 to get project name by ID");
            System.out.println("Press 7 to get type by ID");
            System.out.println("Press 8 to get domain by ID");
            System.out.println("Press 9 to get number of members by ID");
            System.out.println("Press 10 to get budget by ID");
            System.out.println("Press 11 to get domain by project name");
            System.out.println("Press 12 to get project details by ID");
            System.out.println("Press 13 to delete project by ID");
            System.out.println("Press 14 to get all project details");

            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter Id of project to update name:");
                    int idName=sc.nextInt(); sc.nextLine();
                    System.out.print("Enter the updated project name:");
                    company.updateProjectNameById(idName,sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter Id of project to update type:");
                    int idType=sc.nextInt(); sc.nextLine();
                    System.out.print("Enter the updated type:");
                    company.updateTypeById(idType,sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter Id of project to update domain:");
                    int idDomain=sc.nextInt(); sc.nextLine();
                    System.out.print("Enter the updated domain:");
                    company.updateDomainById(idDomain,Domain.valueOf(sc.nextLine().toUpperCase()));
                    break;

                case 4:
                    System.out.print("Enter Id of project to update number of members:");
                    int idMembers=sc.nextInt();
                    System.out.print("Enter the updated number of members:");
                    company.updateNoOfMembersById(idMembers,sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Id of project to update budget:");
                    int idBudget=sc.nextInt();
                    System.out.print("Enter the updated budget:");
                    company.updateBudgetById(idBudget,sc.nextDouble());
                    break;

                case 6:
                    System.out.print("Enter Id to fetch project name:");
                    String name=company.getProjectNameById(sc.nextInt());
                    if(name!=null){
                        System.out.println("Project name for given id is:"+name);
                    }
                    break;

                case 7:
                    System.out.print("Enter Id to fetch type:");
                    String type=company.getTypeById(sc.nextInt());
                    if(type!=null){
                        System.out.println("Type for given id is:"+type);
                    }
                    break;

                case 8:
                    System.out.print("Enter Id to fetch domain:");
                    Domain domain=company.getDomainById(sc.nextInt());
                    if(domain!=null){
                        System.out.println("Domain for given id is:"+domain);
                    }
                    break;

                case 9:
                    System.out.print("Enter Id to fetch number of members:");
                    int members=company.getNoOfMembersById(sc.nextInt());
                    if(members!=0){
                        System.out.println("Number of members for given id is:"+members);
                    }
                    break;

                case 10:
                    System.out.print("Enter Id to fetch budget:");
                    double budget=company.getBudgetById(sc.nextInt());
                    if(budget!=0){
                        System.out.println("Budget for given id is:"+budget);
                    }
                    break;

                case 11:
                    sc.nextLine();
                    System.out.print("Enter project name to fetch domain:");
                    Domain domainByName=company.getDomainByProjectName(sc.nextLine());
                    if(domainByName!=null){
                        System.out.println("Domain for given project name is:"+domainByName);
                    }
                    break;

                case 12:
                    System.out.print("Enter Id to get project details:");
                    company.getProjectById(sc.nextInt());
                    break;

                case 13:
                    System.out.print("Enter project id to delete:");
                    company.deleteProjectById(sc.nextInt());
                    break;

                case 14:
                    company.getProjectInfo();
                    break;

                default:
                    System.out.println("Enter valid option");
            }

            System.out.println("Do you want to continue Yes / No");
            input=sc.next();

        } while(input.equalsIgnoreCase("YES"));

        System.out.println("main ended");
    }

}
