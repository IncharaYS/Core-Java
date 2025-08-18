package com.xworkz.doctorapp.doctor;

public class Doctor {
    private int doctorId;
    private String Specialization;
    private String education;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getAge() {
        return age;
    }

    public String getEducation() {
        return education;
    }

    public String getSpecialization() {
        return Specialization;
    }
}
