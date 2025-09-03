package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;

public class Company {
    Project[] projects=new Project[20];
    int index;

    public boolean addProject(Project project){
        boolean isProjectAdded=false;

        ProjectValidator projectValidator=new ProjectValidator();
        if(projectValidator.validateProject(project)){
            projects[index++]=project;
            isProjectAdded=true;
        }
        return isProjectAdded;
    }

    public void getProjectInfo() {
        for (Project project : projects) {
            System.out.println("Project ID is: " +project.getProjectId());
            System.out.println("Project name is: " +project.getProjectName());
            System.out.println("Project type is: " +project.getType());
            System.out.println("Project domain is: " +project.getDomain());
            System.out.println("Project no of members is: " +project.getNoOfMembers());
            System.out.println("Project budget is: " +project.getBudget()+"\n");
        }
    }
}
