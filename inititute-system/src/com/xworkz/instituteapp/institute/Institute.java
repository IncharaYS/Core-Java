package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validater.TraineeValidator;

public class Institute {
    Trainee trainee;
    public  boolean addTrainee(Trainee trainee){
        boolean isTraineeAdded=false;

        TraineeValidator traineeValidator=new TraineeValidator();
        if(traineeValidator.validateTrainee(trainee)){
            isTraineeAdded=true;
            this.trainee=trainee;
        }
        return isTraineeAdded;
    }

    public void getTraineeInfo(){
        System.out.println("Trainee ID is: "+this.trainee.getTraineeId());
        System.out.println("Trainee name is: "+this.trainee.getName());
        System.out.println("Trainee age is: "+this.trainee.getAge());
        System.out.println("Trainee gender is: "+this.trainee.getGender());
        System.out.println("Trainee phone no is: "+this.trainee.getPhoneNo());
        System.out.println("Trainee email is: "+this.trainee.getEmail());
    }
}
