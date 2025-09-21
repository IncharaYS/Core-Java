package com.xworkz.instituteapp.impl;

import com.xworkz.instituteapp.institute.InstituteRules;
import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validater.TraineeValidator;

public class InstituteImpl implements InstituteRules {

    public InstituteImpl(int size){
        this.trainees=new  Trainee[size];
    }

    public Trainee[] trainees;
    public int index;


    @Override
    public  boolean addTrainee(Trainee trainee){
        boolean isTraineeAdded=false;

        TraineeValidator traineeValidator=new TraineeValidator();
        if(traineeValidator.validateTrainee(trainee)){
            isTraineeAdded=true;
            trainees[index++]=trainee;
        }
        return isTraineeAdded;
    }

    @Override
    public boolean updateNameById(int existingId,String updatedName){
        boolean isUpdated=false;
        for(Trainee trainee:trainees){
            if(trainee.getTraineeId()==existingId){
                trainee.setName(updatedName);
                isUpdated=true;
                System.out.println("Name of "+existingId+" updated to:"+trainee.getName());
            }
        }
        if(!isUpdated) System.out.println("Trainee with id "+existingId+" not found");
        return isUpdated;
    }

    @Override
    public boolean updateAgeById(int existingId,int updatedAge){
        boolean isUpdated=false;
        for(Trainee trainee:trainees){
            if(trainee.getTraineeId()==existingId){
                trainee.setAge(updatedAge);
                isUpdated=true;
                System.out.println("Age of "+existingId+" updated to:"+trainee.getAge());
            }
        }
        if(!isUpdated) System.out.println("Trainee with id "+existingId+" not found");
        return isUpdated;
    }

    @Override
    public boolean updatePhoneNoById(int existingId,long updatedPhoneNo){
        boolean isUpdated=false;
        for(Trainee trainee:trainees){
            if(trainee.getTraineeId()==existingId){
                trainee.setPhoneNo(updatedPhoneNo);
                isUpdated=true;
                System.out.println("Phone no of "+existingId+" updated to:"+trainee.getPhoneNo());
            }
        }
        if(!isUpdated) System.out.println("Trainee with id "+existingId+" not found");
        return isUpdated;
    }

    @Override
    public boolean updateEmailById(int existingId,String updatedEmail){
        boolean isUpdated=false;
        for(Trainee trainee:trainees){
            if(trainee.getTraineeId()==existingId){
                trainee.setEmail(updatedEmail);
                isUpdated=true;
                System.out.println("Email of "+existingId+" updated to:"+trainee.getName());
            }
        }
        if(!isUpdated) System.out.println("Trainee with id "+existingId+" not found");
        return isUpdated;
    }

    @Override
    public String getNameById(int existingId){
        boolean isNameFound=false;
        for(Trainee trainee:trainees){
            if(trainee.getTraineeId()==existingId){
                isNameFound=true;
                return trainee.getName();
            }
        }
        System.out.println("Trainee with id "+existingId+" not found" );
        return null;
    }

    @Override
    public String getEmailById(int existingId){
        boolean isEmailFound=false;
        for(Trainee trainee:trainees){
            if(trainee.getTraineeId()==existingId){
                isEmailFound=true;
                return trainee.getEmail();
            }
        }
        System.out.println("Trainee with id "+existingId+" not found" );
        return null;
    }

    @Override
    public void deleteTraineeByName(String name){
        boolean isDeleted=false;
        for(int i=0;i<trainees.length;i++){
            if(trainees[i].getName().equals(name)&&trainees[i]!=null){
                for(int j=i;j<trainees.length-1;j++){
                    trainees[j]=trainees[j+1];
                }
                trainees[trainees.length-1]=null;
                System.out.println("Trainee with name "+name+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No trainee with given name found");
    }

    @Override
    public void deleteTraineeById(int id){
        boolean isDeleted=false;
        for(int i=0;i<trainees.length;i++){
            if(trainees[i].getTraineeId()==id&&trainees[i]!=null){
                for (int j=i;j<trainees.length-1;j++) {
                    trainees[j]=trainees[j+1];
                }
                trainees[trainees.length - 1] = null;
                System.out.println("Trainee with id "+id+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No trainee with id "+id+" is found");
    }

    @Override
    public Trainee getTraineeById(int existingId){
        Trainee trainee=null;
        for(Trainee traine:trainees){
            if(traine.getTraineeId()==existingId){
                trainee=traine;
                System.out.println("Trainee details are:");
                getTraineeDetails(traine);
            }
        }
        return trainee;
    }

    @Override
    public void getTraineeDetails(Trainee trainee){
        if (trainee != null) {
            System.out.println("Trainee ID is: " + trainee.getTraineeId());
            System.out.println("Trainee name is: " + trainee.getName());
            System.out.println("Trainee age is: " + trainee.getAge());
            System.out.println("Trainee gender is: " + trainee.getGender());
            System.out.println("Trainee phone no is: " + trainee.getPhoneNo());
            System.out.println("Trainee email is: " + trainee.getEmail());
            System.out.println("--------------------------------------------------");
        }
        else{
            System.out.println("No trainee found");
            System.out.println("--------------------------------------------------");
        }
    }

    @Override
    public void getTraineeInfo() {
        System.out.println("Trainee details are:");
        for (Trainee trainee : trainees) {
            if (trainee != null) {
                System.out.println("Trainee ID is: " + trainee.getTraineeId());
                System.out.println("Trainee name is: " + trainee.getName());
                System.out.println("Trainee age is: " + trainee.getAge());
                System.out.println("Trainee gender is: " + trainee.getGender());
                System.out.println("Trainee phone no is: " + trainee.getPhoneNo());
                System.out.println("Trainee email is: " + trainee.getEmail());
                System.out.println("--------------------------------------------------");
            }
            else{
                System.out.println("No trainee found");
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
