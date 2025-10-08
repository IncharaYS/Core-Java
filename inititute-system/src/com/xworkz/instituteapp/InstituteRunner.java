package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.impl.InstituteImpl;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Scanner;

public class InstituteRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of trainees:");
        int size=sc.nextInt();
        InstituteImpl institute=new InstituteImpl(size);
        System.out.println("Number of trainees to be entered is:"+institute.trainees.length);
        for (int i=0;i<institute.trainees.length;i++){
            System.out.println("Enter details of trainee "+(i+1));
            Trainee trainee=new Trainee();
            System.out.print("Enter trainee id:");
            trainee.setTraineeId(sc.nextInt());
            System.out.print("Enter trainee name:");sc.nextLine();
            trainee.setName(sc.nextLine());
            System.out.print("Enter trainee gender:");
            trainee.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter trainee age:");
            trainee.setAge(sc.nextInt());
            System.out.print("Enter trainee's phone number:");
            trainee.setPhoneNo(sc.nextLong());
            System.out.print("Enter trainee's email:");sc.nextLine();
            trainee.setEmail(sc.nextLine());
            institute.addTrainee(trainee);
            System.out.println("----------------------------------------------------");
        }
        institute.getTraineeInfo();

        System.out.print("Enter Id of trainee to update name:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=institute.updateNameById(id,sc.nextLine());
        if(isUpdated) System.out.println("Name updated successfully \n");
        else System.out.println("Failed to update name \n");

//        institute.updateAgeById(1,78);
//        institute.updateEmailById(1,"incharays@gmail.com");
//        institute.updatePhoneNoById(1,9753689754L);


        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+institute.getNameById(sc.nextInt()));

//        institute.getEmailById(1);

        System.out.println("Enter id to get trainee details");
        institute.getTraineeById(sc.nextInt());

//        institute.deleteTraineeByName("Sahana");

        System.out.print("Enter the id of trainee to delete their details:");
        institute.deleteTraineeById(sc.nextInt());
        institute.getTraineeInfo();

    }
}
