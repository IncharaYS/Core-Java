package com.xworkz.companyapp.company;

import com.xworkz.companyapp.constants.Domain;
import com.xworkz.companyapp.project.Project;

public interface CompanyRules {
    boolean addProject(Project project);
    boolean updateProjectNameById(int existingId,String updatedProjectName);
    boolean updateTypeById(int existingId,String updatedType);
    boolean updateDomainById(int existingId, Domain updatedDomain);
    boolean updateNoOfMembersById(int existingId,int updatedNoOfMembers);
    boolean updateBudgetById(int existingId,double updatedBudget);
    String getProjectNameById(int existingProjectId);
    String getTypeById(int existingProjectId);
    Domain getDomainById(int existingProjectId);
    int getNoOfMembersById(int existingProjectId);
    double getBudgetById(int existingProjectId);
    Domain getDomainByProjectName(String projectName);
//    void deleteProjectByProjectName(String projectName);
    void deleteProjectById(int id);
    Project getProjectById(int existingId);
    void getProjectDetails(Project project);
    void getProjectInfo();

}
