package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.constants.Gender;
import com.xworkz.loksabhaapp.impl.LokSabhaImpl;
import com.xworkz.loksabhaapp.politician.Politician;

import java.util.Scanner;

public class LokSabhaRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of politicians to add:");
        int size=sc.nextInt();
        LokSabhaImpl lokSabha=new LokSabhaImpl(size);
        System.out.println("The number of politicians to add is:"+lokSabha.politicians.length);

        for(int i=0;i<size;i++){
            System.out.println("Enter details of politician "+(i+1));
            Politician politician=new Politician();
            System.out.print("Enter the politician's id:");
            politician.setPoliticianId(sc.nextInt());sc.nextLine();
            System.out.print("Enter the politician's name:");
            politician.setName(sc.nextLine());
            System.out.print("Enter the politician's age:");
            politician.setAge(sc.nextInt());sc.nextLine();
            System.out.print("Enter the politician's gender:");
            politician.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter the politician's party:");
            politician.setParty(sc.nextLine());
            System.out.print("Enter the politician's state:");
            politician.setState(sc.nextLine());
            lokSabha.addPolitician(politician);
            System.out.println("----------------------------------------------------------");
        }

        lokSabha.getPoliticianInfo();

        System.out.print("Enter Id of politician to update age:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=lokSabha.updateAgeById(id,sc.nextInt());
        if(isUpdated) System.out.println("Age updated successfully \n");
        else System.out.println("Failed to update age \n");

//        lokSabha.updateNameById(1,"Modhi");
//        lokSabha.updateGenderById(1,Gender.F);
//        lokSabha.updatePartyById(2,"BJP");
//        lokSabha.updateStateById(3,"Karnataka");

        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+lokSabha.getNameById(sc.nextInt()));

//        lokSabha.getAgeById(1);
//        lokSabha.getGenderById(1);
//        lokSabha.getPartyById(2);
//        lokSabha.getStateById(2);

        System.out.println("Enter id to get politician details");
        lokSabha.getPoliticianById(sc.nextInt());

//        lokSabha.deletePoliticianByParty("BJP");
//        lokSabha.deletePoliticianByName("Sidharamayya");

        System.out.print("Enter politician id to delete their details:");
        lokSabha.deletePoliticianById(sc.nextInt());
        lokSabha.getPoliticianInfo();

    }
}
