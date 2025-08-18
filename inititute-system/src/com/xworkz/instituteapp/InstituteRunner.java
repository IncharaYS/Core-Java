package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

public class InstituteRunner {
    public static void main(String[] args) {
        Trainee trainee=new Trainee();
        trainee.setTraineeId(1);
        trainee.setName("Inchara");
        trainee.setAge(21);
        trainee.setGender('F');
        trainee.setEmail("incharays07@gmail.com");
        trainee.setPhoneNo(9876543219L);

        Institute institute=new Institute();
        if(institute.addTrainee(trainee)) institute.getTraineeInfo();
        else System.out.println("Trainee is not added");
    }
}
