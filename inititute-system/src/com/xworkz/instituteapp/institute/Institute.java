package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validater.TraineeValidator;

public class Institute {
    Trainee[] trainees=new Trainee[15];
    int index;

    public  boolean addTrainee(Trainee trainee){
        boolean isTraineeAdded=false;

        TraineeValidator traineeValidator=new TraineeValidator();
        if(traineeValidator.validateTrainee(trainee)){
            isTraineeAdded=true;
            trainees[index++]=trainee;
        }
        return isTraineeAdded;
    }

    public void getTraineeInfo() {
        for (Trainee trainee : trainees) {
            System.out.println("Trainee ID is: " +trainee.getTraineeId());
            System.out.println("Trainee name is: " +trainee.getName());
            System.out.println("Trainee age is: " +trainee.getAge());
            System.out.println("Trainee gender is: " +trainee.getGender());
            System.out.println("Trainee phone no is: " +trainee.getPhoneNo());
            System.out.println("Trainee email is: " +trainee.getEmail()+"\n");
        }
    }
}
