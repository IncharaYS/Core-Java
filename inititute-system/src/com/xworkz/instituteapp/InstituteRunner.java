package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.Gender;
import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Scanner;

public class InstituteRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of trainees:");
        int size=sc.nextInt();
        Institute institute=new Institute(size);
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


        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+institute.getNameById(sc.nextInt()));


        System.out.println("Enter id to get trainee details");
        institute.getTraineeById(sc.nextInt());

        System.out.print("Enter the id of trainee to delete their details:");
        institute.deleteTraineeById(sc.nextInt());
        institute.getTraineeInfo();

        /*Trainee trainee1=new Trainee();
        trainee1.setTraineeId(1);
        trainee1.setName("Inchara");
        trainee1.setAge(21);
        trainee1.setGender('F');
        trainee1.setEmail("incharays07@gmail.com");
        trainee1.setPhoneNo(9876543219L);

        Institute institute=new Institute();
        institute.addTrainee(trainee1);

        Trainee trainee2=new Trainee(2,"Rashmi M",'F',21,9876358976L,"rashmi123@gmail.com");
        institute.addTrainee(trainee2);

        Trainee trainee3=new Trainee(3,"Amit K",'M',22,9876543210L,"amit.kumar@gmail.com");
        institute.addTrainee(trainee3);

        Trainee trainee4=new Trainee(4,"Sneha R",'F',20,9876123456L,"sneha.r@gmail.com");
        institute.addTrainee(trainee4);

        Trainee trainee5=new Trainee(5,"Vikram S",'M',23,9876987654L,"vikram.singh@gmail.com");
        institute.addTrainee(trainee5);

        Trainee trainee6=new Trainee(6,"Priya P",'F',21,9876345678L,"priya.p@gmail.com");
        institute.addTrainee(trainee6);

        Trainee trainee7=new Trainee(7,"Karthik M",'M',22,9876234598L,"karthik.m@gmail.com");
        institute.addTrainee(trainee7);

        Trainee trainee8=new Trainee(8,"Anjali S",'F',20,9876456789L,"anjali.singh@gmail.com");
        institute.addTrainee(trainee8);

        Trainee trainee9=new Trainee(9,"Rohan K",'M',24,9876345987L,"rohan.k@gmail.com");
        institute.addTrainee(trainee9);

        Trainee trainee10=new Trainee(10,"Meena J",'F',22,9876123987L,"meena.j@gmail.com");
        institute.addTrainee(trainee10);

        Trainee trainee11=new Trainee(11,"Suresh R",'M',23,9876981234L,"suresh.r@gmail.com");
        institute.addTrainee(trainee11);

        Trainee trainee12=new Trainee(12,"Divya L",'F',21,9876789123L,"divya.l@gmail.com");
        institute.addTrainee(trainee12);

        Trainee trainee13=new Trainee(13,"Rahul P",'M',22,9876654321L,"rahul.p@gmail.com");
        institute.addTrainee(trainee13);

        Trainee trainee14=new Trainee(14,"Kavya N",'F',20,9876012345L,"kavya.n@gmail.com");
        institute.addTrainee(trainee14);

        Trainee trainee15=new Trainee(15,"Arjun V",'M',21,9876765432L,"arjun.v@gmail.com");
        institute.addTrainee(trainee15);

        institute.getTraineeInfo();
        /*if(institute.addTrainee(trainee)) institute.getTraineeInfo();
        else System.out.println("Trainee is not added");*/
    }
}
