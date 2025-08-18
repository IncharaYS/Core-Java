package com.xworkz.companyapp.validator;

import com.xworkz.companyapp.project.Project;

public class ProjectValidator {
    public boolean validateProject(Project project){
        boolean isProjectValidated=false;
        boolean isProjectIdValid=false;
        boolean isProjectNameValid=false;
        boolean isBudgetValid=false;
        boolean isNoOfWorkersValid=false;
        boolean isTypeValid=false;
        boolean isDomainValid=false;

        if(project.getProjectId()>0) isProjectIdValid=true;
        else System.out.println("Entered Id is not valid");

        if(project.getProjectName()!=null&&!project.getProjectName().isEmpty()) isProjectNameValid=true;
        else System.out.println("Entered name is not valid");

        if (project.getBudget()>0) isBudgetValid=true;
        else System.out.println("Entered budget is not valid");

        if (project.getDomain()!=null&&!project.getDomain().isEmpty()) isDomainValid=true;
        else System.out.println("Entered domain is not valid");

        if (project.getType()!=null&&!project.getType().isEmpty()) isTypeValid=true;
        else System.out.println("Entered type is not valid");

        if (project.getNoOfMembers()>0) isNoOfWorkersValid=true;
        else System.out.println("Entered no of workers is not valid");

        if(isDomainValid&&isBudgetValid&&isProjectIdValid&&isProjectNameValid&&isNoOfWorkersValid&&isTypeValid){
            isProjectValidated=true;
        }

        return isProjectValidated;
    }
}
