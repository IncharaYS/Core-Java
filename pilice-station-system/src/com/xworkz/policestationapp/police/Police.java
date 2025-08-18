package com.xworkz.policestationapp.police;

public class Police {
    private int policeId;
    private String name;
    private String gender;
    private String rank;
    private String department;
    private String shift;

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPoliceId() {
        return policeId;
    }

    public void setPoliceId(int policeId) {
        this.policeId = policeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getRank() {
        return rank;
    }

    public String getShift() {
        return shift;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
