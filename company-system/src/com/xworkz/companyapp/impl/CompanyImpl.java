package com.xworkz.companyapp.impl;

import com.xworkz.companyapp.company.CompanyRules;
import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;
import com.xworkz.companyapp.exception.*;

public class CompanyImpl implements CompanyRules {

    public CompanyImpl(int size){
        this.projects=new Project[size];
    }

    public Project[] projects;
    public int index;

    @Override
    public boolean addProject(Project project){
        boolean isProjectAdded=false;
        try {
            ProjectValidator projectValidator=new ProjectValidator();
            if(projectValidator.validateProject(project)){
                projects[index++]=project;
                isProjectAdded=true;
            }
            else throw new ProjectNotAddedException("Project not added, invalid details entered");
        }
        catch(ProjectNotAddedException pnae){
            System.out.println("Project is not added");
            pnae.printStackTrace();
        }
        return isProjectAdded;
    }

    @Override
    public boolean updateProjectNameById(int existingId,String updatedProjectName){
        boolean isProjectNameUpdated=false;
        try {
            for(Project project:this.projects){
                if(project!=null&&project.getProjectId()==existingId){
                    project.setProjectName(updatedProjectName);
                    isProjectNameUpdated=true;
                    System.out.println("Name of project "+project.getProjectId()+" updated to:"+project.getProjectName());
                    return isProjectNameUpdated;
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isProjectNameUpdated;
    }

    @Override
    public boolean updateTypeById(int existingId,String updatedType){
        boolean isTypeUpdated=false;
        try {
            for(Project project:this.projects){
                if(project!=null&&project.getProjectId()==existingId){
                    project.setType(updatedType);
                    isTypeUpdated=true;
                    System.out.println("Type of project "+project.getProjectId()+" updated to:"+project.getType());
                    return isTypeUpdated;
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isTypeUpdated;
    }

    @Override
    public boolean updateDomainById(int existingId,Domain updatedDomain){
        boolean isDomainUpdated=false;
        try {
            for(Project project:this.projects){
                if(project!=null&&project.getProjectId()==existingId){
                    project.setDomain(updatedDomain);
                    isDomainUpdated=true;
                    System.out.println("Domain of project "+project.getProjectId()+" updated to:"+project.getDomain());
                    return isDomainUpdated;
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isDomainUpdated;
    }

    @Override
    public boolean updateNoOfMembersById(int existingId,int updatedNoOfMembers){
        boolean isNoOfMembersUpdated=false;
        try {
            for(Project project:this.projects){
                if(project!=null&&project.getProjectId()==existingId){
                    project.setNoOfMembers(updatedNoOfMembers);
                    isNoOfMembersUpdated=true;
                    System.out.println("No of members of project "+project.getProjectId()+" updated to:"+project.getNoOfMembers());
                    return isNoOfMembersUpdated;
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isNoOfMembersUpdated;
    }

    @Override
    public boolean updateBudgetById(int existingId,double updatedBudget){
        boolean isBudgetUpdated=false;
        try {
            for(Project project:this.projects){
                if(project!=null&&project.getProjectId()==existingId){
                    project.setBudget(updatedBudget);
                    isBudgetUpdated=true;
                    System.out.println("Budget of project "+project.getProjectId()+" updated to:"+project.getBudget());
                    return isBudgetUpdated;
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isBudgetUpdated;
    }

    @Override
    public String getProjectNameById(int existingProjectId){
        try {
            for(Project project:projects){
                if(project!=null&&project.getProjectId()==existingProjectId){
                    return project.getProjectName();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingProjectId+" does not exist");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public String getTypeById(int existingProjectId){
        try {
            for(Project project:projects){
                if(project!=null&&project.getProjectId()==existingProjectId){
                    return project.getType();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingProjectId+" does not exist");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public Domain getDomainById(int existingProjectId){
        try {
            for(Project project:projects){
                if(project!=null&&project.getProjectId()==existingProjectId){
                    return project.getDomain();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingProjectId+" does not exist");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public int getNoOfMembersById(int existingProjectId){
        try {
            for(Project project:projects){
                if(project!=null&&project.getProjectId()==existingProjectId){
                    return project.getNoOfMembers();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingProjectId+" does not exist");
            infe.printStackTrace();
        }
        return 0;
    }

    @Override
    public double getBudgetById(int existingProjectId){
        try {
            for(Project project:projects){
                if(project!=null&&project.getProjectId()==existingProjectId){
                    return project.getBudget();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Project Id "+existingProjectId+" does not exist");
            infe.printStackTrace();
        }
        return 0;
    }

    @Override
    public Domain getDomainByProjectName(String projectName){
        try {
            for(Project project:projects){
                if(project!=null&&project.getProjectName().equals(projectName)){
                    return project.getDomain();
                }
            }
            throw new ProjectNameNotFoundException("Given name not found");
        }
        catch(ProjectNameNotFoundException nnfe){
            System.out.println("Project name "+projectName+" does not exist");
            nnfe.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteProjectById(int id){
        boolean isDeleted=false;
        try {
            for(int i=0;i<projects.length;i++){
                if(projects[i]!=null&&projects[i].getProjectId()==id){
                    for(int j=i;j<projects.length-1;j++){
                        projects[j]=projects[j+1];
                    }
                    projects[projects.length-1]=null;
                    System.out.println("Project with id "+id+" is deleted \n");
                    isDeleted=true;
                    break;
                }
            }
            if(!isDeleted) throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("No project with id "+id+" is found");
            infe.printStackTrace();
        }
    }

    @Override
    public void getProjectInfo(){
        System.out.println("Project details are:");
        for(Project project:projects){
            try {
                if(project!=null){
                    System.out.println("Project ID is:"+project.getProjectId());
                    System.out.println("Project name is:"+project.getProjectName());
                    System.out.println("Project type is:"+project.getType());
                    System.out.println("Project domain is:"+project.getDomain());
                    System.out.println("Project no of members is:"+project.getNoOfMembers());
                    System.out.println("Project budget is:"+project.getBudget());
                    System.out.println("---------------------------------------------");
                }
                else throw new ProjectNotFoundException("Project not found");
            }
            catch(ProjectNotFoundException pnfe){
                System.out.println("Project not found");
                pnfe.printStackTrace();
            }
        }
    }

    @Override
    public Project getProjectById(int existingId){
        Project project=null;
        try {
            for(Project pro:projects){
                if(pro!=null&&pro.getProjectId()==existingId){
                    project=pro;
                    System.out.println("Project details are:");
                    getProjectDetails(pro);
                }
            }
            if(project==null) throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("No project with id "+existingId+" is found");
            infe.printStackTrace();
        }
        return project;
    }

    @Override
    public void getProjectDetails(Project project){
        try {
            if(project!=null){
                System.out.println("Project ID is:"+project.getProjectId());
                System.out.println("Project name is:"+project.getProjectName());
                System.out.println("Project type is:"+project.getType());
                System.out.println("Project domain is:"+project.getDomain());
                System.out.println("Project no of members is:"+project.getNoOfMembers());
                System.out.println("Project budget is:"+project.getBudget());
                System.out.println("---------------------------------------------");
            }
            else throw new ProjectNotFoundException("Project not found");
        }
        catch(ProjectNotFoundException pnfe){
            System.out.println("Project not found");
            pnfe.printStackTrace();
        }
    }

}
