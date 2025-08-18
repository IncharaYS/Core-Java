package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;

public class Company {
    Project project;
    public boolean addProject(Project project){
        boolean isProjectAdded=false;

        ProjectValidator projectValidator=new ProjectValidator();
        if(projectValidator.validateProject(project)){
            this.project=project;
            isProjectAdded=true;
        }
        return isProjectAdded;
    }

    public void getProjectInfo(){
        System.out.println("Project ID is: "+this.project.getProjectId());
        System.out.println("Project name is: "+this.project.getProjectName());
        System.out.println("Project type is: "+this.project.getType());
        System.out.println("Project domain is: "+this.project.getDomain());
        System.out.println("Project no of members is: "+this.project.getNoOfMembers());
        System.out.println("Project brdget is: "+this.project.getBudget());
    }
}
