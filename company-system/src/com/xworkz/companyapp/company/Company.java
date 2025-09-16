package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.project.Project;
import com.xworkz.companyapp.validator.ProjectValidator;



public class Company {

    public Company(int size){
        this.projects=new Project[size];
    }

    public Project[] projects;
    public int index;

    public boolean addProject(Project project){
        boolean isProjectAdded=false;

        ProjectValidator projectValidator=new ProjectValidator();
        if(projectValidator.validateProject(project)){
            projects[index++]=project;
            isProjectAdded=true;
        }
        return isProjectAdded;
    }


    public boolean updateProjectNameById(int existingId,String updatedProjectName){
        boolean isProjectNameUpdated=false;
        for(Project project:this.projects){
            if(project.getProjectId()==existingId){
                project.setProjectName(updatedProjectName);
                isProjectNameUpdated=true;
                System.out.println("Name of project "+project.getProjectId()+" updated to:"+project.getProjectName());
            }
            if(!isProjectNameUpdated) System.out.println("Project Id "+existingId+" does not exist");
        }

        return isProjectNameUpdated;
    }

    public boolean updateTypeById(int existingId,String updatedType){
        boolean isTypeUpdated=false;
        for(Project project:this.projects){
            if(project.getProjectId()==existingId){
                project.setType(updatedType);
                isTypeUpdated=true;
                System.out.println("Type of project "+project.getProjectId()+" updated to:"+project.getType());
            }
            if(!isTypeUpdated) System.out.println("Project Id "+existingId+" does not exist");
        }
        return isTypeUpdated;
    }

    public boolean updateDomainById(int existingId, Domain updatedDomain){
        boolean isDomainUpdated=false;
        for(Project project:this.projects){
            if(project.getProjectId()==existingId){
                project.setDomain(updatedDomain);
                isDomainUpdated=true;
                System.out.println("Domain of project "+project.getProjectId()+" updated to:"+project.getDomain());
            }
            if(!isDomainUpdated) System.out.println("Project Id "+existingId+" does not exist");
        }
        return isDomainUpdated;
    }

    public boolean updateNoOfMembersById(int existingId,int updatedNoOfMembers){
        boolean isNoOfMembersUpdated=false;
        for(Project project:this.projects){
            if(project.getProjectId()==existingId){
                project.setNoOfMembers(updatedNoOfMembers);
                isNoOfMembersUpdated=true;
                System.out.println("No of members of project "+project.getProjectId()+" updated to:"+project.getNoOfMembers());
            }
            if(!isNoOfMembersUpdated) System.out.println("Project Id "+existingId+" does not exist");
        }
        return isNoOfMembersUpdated;
    }

    public boolean updateBudgetById(int existingId,double updatedBudget){
        boolean isBudgetUpdated=false;
        for(Project project:this.projects){
            if(project.getProjectId()==existingId){
                project.setBudget(updatedBudget);
                isBudgetUpdated=true;
                System.out.println("Budget of project "+project.getProjectId()+" updated to:"+project.getBudget());
            }
            if(!isBudgetUpdated) System.out.println("Project Id "+existingId+" does not exist");
        }
        return isBudgetUpdated;
    }


    public String getProjectNameById(int existingProjectId){
        boolean isIdFound=false;
        for(Project project:projects){
            if(project.getProjectId()==existingProjectId){
                isIdFound=true;
                return project.getProjectName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public String getTypeById(int existingProjectId){
        boolean isIdFound=false;
        for(Project project:projects){
            if(project.getProjectId()==existingProjectId){
                isIdFound=true;
                return project.getType();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public Domain getDomainById(int existingProjectId){
        boolean isIdFound=false;
        for(Project project:projects){
            if(project.getProjectId()==existingProjectId){
                isIdFound=true;
                return project.getDomain();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public int getNoOfMembersById(int existingProjectId){
        boolean isIdFound=false;
        for(Project project:projects){
            if(project.getProjectId()==existingProjectId){
                isIdFound=true;
                return project.getNoOfMembers();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    public double getBudgetById(int existingProjectId){
        boolean isIdFound=false;
        for(Project project:projects){
            if(project.getProjectId()==existingProjectId){
                isIdFound=true;
                return project.getBudget();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    public Domain getDomainByProjectName(String projectName){
        boolean isProjectNameFound=false;
        for(Project project:projects){
            if(project.getProjectName().equals(projectName)){
                isProjectNameFound=true;
                return project.getDomain();
            }
        }
        System.out.println("Project name entered not found");
        return null;
    }


    public void deleteProjectByProjectName(String projectName){
        boolean isDeleted=false;
        for(int i=0;i<projects.length;i++){
            if(projects[i]!=null&&projects[i].getProjectName().equals(projectName)){
                for(int j=i;j<projects.length-1;j++){
                    projects[j]=projects[j+1];
                }
                projects[projects.length-1]=null;
                System.out.println("Project with name "+projectName+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No project with name "+projectName+" is found");
    }





    public void deleteProjectById(int id){
        boolean isDeleted=false;
        for(int i=0;i<projects.length;i++){
            if(projects[i].getProjectId()==id&&projects[i]!=null){
                for (int j=i;j<projects.length-1;j++) {
                    projects[j]=projects[j+1];
                }
                projects[projects.length - 1] = null;
                System.out.println("Project with id "+id+"is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No project with id "+id+" is found");
    }

    public Project getProjectById(int existingId){
        Project project=null;
        for(Project pro:projects){
            if(pro.getProjectId()==existingId){
                project=pro;
                System.out.println("Project details are:");
                getProjectDetails(pro);
            }
        }
        return project;
    }

    public void getProjectDetails(Project project){
            if (project != null) {
                System.out.println("Project ID is: " + project.getProjectId());
                System.out.println("Project name is: " + project.getProjectName());
                System.out.println("Project type is: " + project.getType());
                System.out.println("Project domain is: " + project.getDomain());
                System.out.println("Project no of members is: " + project.getNoOfMembers());
                System.out.println("Project budget is: " + project.getBudget());
                System.out.println("---------------------------------------------");
            } else {
                System.out.println("No product found");
                System.out.println("---------------------------------------------");
            }
    }

    public void getProjectInfo() {
        System.out.println("Project details are:");
        for (Project project : projects) {
            if (project != null) {
                System.out.println("Project ID is: " + project.getProjectId());
                System.out.println("Project name is: " + project.getProjectName());
                System.out.println("Project type is: " + project.getType());
                System.out.println("Project domain is: " + project.getDomain());
                System.out.println("Project no of members is: " + project.getNoOfMembers());
                System.out.println("Project budget is: " + project.getBudget());
                System.out.println("---------------------------------------------");
            } else {
                System.out.println("No product found");
                System.out.println("---------------------------------------------");
            }
        }
    }
}
