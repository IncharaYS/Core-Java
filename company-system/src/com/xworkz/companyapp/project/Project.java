package com.xworkz.companyapp.project;

import com.xworkz.companyapp.constants.Domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private int projectId;
    private String projectName;
    private String type;
    private Domain domain;
    private int noOfMembers;
    private double budget;

    @Override
    public String toString(){
        return "Project-(projectId="+this.projectId+
                ", projectName="+this.projectName+
                ", type="+this.type+
                ", domain="+this.domain+
                ", noOfMembers="+this.noOfMembers+
                ", budget="+this.budget+
                ")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Project){
            Project project=(Project) obj;
            if(this.projectId==project.projectId && this.projectName.equals(project.projectName) && this.type.equals(project.type) && this.domain.equals(project.domain) &&
            this.noOfMembers==project.noOfMembers && this.budget==project.budget){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, type, domain, noOfMembers, budget);
    }
}
