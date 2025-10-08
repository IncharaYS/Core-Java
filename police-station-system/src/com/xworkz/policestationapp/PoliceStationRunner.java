package com.xworkz.policestationapp;

import com.xworkz.policestationapp.constants.Gender;
import com.xworkz.policestationapp.impl.PoliceStationImpl;
import com.xworkz.policestationapp.police.Police;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of police to add the police station:");
        int size=sc.nextInt();
        PoliceStationImpl policeStation=new PoliceStationImpl(size);
        System.out.println("The number of police details to be added is "+policeStation.polices.length);

        for(int i=0;i<size;i++){
            System.out.println("Enter details of police "+(i+1));
            Police police=new Police();
            System.out.print("Enter the police id:");
            police.setPoliceId(sc.nextInt());sc.nextLine();
            System.out.print("Enter the police name:");
            police.setName(sc.nextLine());
            System.out.print("Enter the police gender:");
            police.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter the police rank:");
            police.setRank(sc.nextLine());
            System.out.print("Enter the police department:");
            police.setDepartment(sc.nextLine());
            System.out.print("Enter the police shift:");
            police.setShift(sc.nextLine());
            policeStation.addPolice(police);
            System.out.println("--------------------------------------------------------------");
        }


        policeStation.getPoliceInfo();

        System.out.print("Enter Id of police to update name:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=policeStation.updateNameById(id,sc.nextLine());
        if(isUpdated) System.out.println("Name updated successfully \n");
        else System.out.println("Failed to update name\n");

//        policeStation.updateShiftById(1,"Morning");
//        policeStation.updateGenderById(1,Gender.O);
//        policeStation.updateDepartmentById(2,"Crime");
//        policeStation.updateRankById(2,"SIP");


        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+policeStation.getNameById(sc.nextInt()));

//        policeStation.getGenderById(1);
//        policeStation.getDepartmentById(1);
//        policeStation.getGenderByName("Suresh");
//        policeStation.getRankById(1);
//        policeStation.getShiftById(2);
//        policeStation.deletePoliceByName("Suresh");

        System.out.println("Enter id to get police details");
        policeStation.getPoliceById(sc.nextInt());

        System.out.print("Enter police id to delete their details:");
        policeStation.deletePoliceById(sc.nextInt());
        policeStation.getPoliceInfo();

    }
}
