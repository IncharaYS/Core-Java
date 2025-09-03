package com.xworkz.companyapp.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private int projectId;
    private String projectName;
    private String type;
    private String domain;
    private int noOfMembers;
    private double budget;

   /* public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getProjectId() {
        return projectId;
    }

    public double getBudget() {
        return budget;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }*/
}
