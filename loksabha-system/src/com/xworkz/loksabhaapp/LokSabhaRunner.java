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

        /*Politician politician1=new Politician();
        politician1.setPoliticianId(1);
        politician1.setAge(74);
        politician1.setGender("Male");
        politician1.setParty("BJP");
        politician1.setName("Narendra Modi");
        politician1.setState("Gujarat");

        LokSabhaImpl lokSabha=new LokSabhaImpl();
        lokSabha.addPolitician(politician1);

        Politician politician2=new Politician(2,"Rahul gandhi","Male",64,"Congress","Delhi");
        lokSabha.addPolitician(politician2);

        Politician politician3=new Politician(3,"Narendra Modi","Male",73,"BJP","Varanasi");
        lokSabha.addPolitician(politician3);

        Politician politician4=new Politician(4,"Amit Shah","Male",60,"BJP","Gandhinagar");
        lokSabha.addPolitician(politician4);

        Politician politician5=new Politician(5,"Sonia Gandhi","Female",77,"Congress","Raebareli");
        lokSabha.addPolitician(politician5);

        Politician politician6=new Politician(6,"Akhilesh Yadav","Male",51,"Samajwadi Party","Azamgarh");
        lokSabha.addPolitician(politician6);

        Politician politician7=new Politician(7,"Mamata Banerjee","Female",69,"TMC","Kolkata");
        lokSabha.addPolitician(politician7);

        Politician politician8=new Politician(8,"Sharad Pawar","Male",84,"NCP","Baramati");
        lokSabha.addPolitician(politician8);

        Politician politician9=new Politician(9,"Arvind Kejriwal","Male",56,"AAP","New Delhi");
        lokSabha.addPolitician(politician9);

        Politician politician10=new Politician(10,"Mayawati","Female",68,"BSP","Lucknow");
        lokSabha.addPolitician(politician10);

        Politician politician11=new Politician(11,"Yogi Adityanath","Male",52,"BJP","Gorakhpur");
        lokSabha.addPolitician(politician11);

        Politician politician12=new Politician(12,"Shashi Tharoor","Male",68,"Congress","Thiruvananthapuram");
        lokSabha.addPolitician(politician12);

        lokSabha.getPoliticianInfo();

        /*if(lokSabha.addPolitician(politician)) lokSabha.getPoliticianInfo();
        else System.out.println("Politician is not added");*/
    }
}
