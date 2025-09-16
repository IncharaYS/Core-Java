package com.xworkz.instituteapp.validater;

import com.xworkz.instituteapp.trainee.Trainee;

public class TraineeValidator {
    public boolean validateTrainee(Trainee trainee){
        boolean  isTraineeValidated=false;
        boolean isTraineeIdValid=false;
        boolean isNameValid=false;
        boolean isGenderValid=false;
        boolean isAgeValid=false;
        boolean isPhoneNoValid=false;
        boolean isEmailValid=false;

        if(trainee.getTraineeId()>0) isTraineeIdValid=true;
        else System.out.println("Entered Id is not valid");

        if (trainee.getAge()>0) isAgeValid=true;
        else System.out.println("Entered age is not valid");

        if (trainee.getGender()!=null) isGenderValid=true;
        else System.out.println("Entered gender is not valid");

        if (trainee.getName()!=null&&!trainee.getName().isEmpty()) isNameValid=true;
        else System.out.println("Entered name is not valid");

        if (trainee.getEmail()!=null&&!trainee.getEmail().isEmpty()) isEmailValid=true;
        else System.out.println("Entered email is not valid");

        if (trainee.getPhoneNo()>0) isPhoneNoValid=true;
        else System.out.println("Entered phone no is not valid");

        if (isNameValid&&isAgeValid&&isGenderValid&&isEmailValid&&isPhoneNoValid&&isTraineeIdValid){
            isTraineeValidated=true;
        }


        return isTraineeValidated;
    }
}
