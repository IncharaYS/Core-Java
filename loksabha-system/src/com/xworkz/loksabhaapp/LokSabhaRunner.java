package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.LokSabha;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokSabhaRunner {
    public static void main(String[] args) {
        Politician politician1=new Politician();
        politician1.setPoliticianId(1);
        politician1.setAge(74);
        politician1.setGender("Male");
        politician1.setParty("BJP");
        politician1.setName("Narendra Modi");
        politician1.setState("Gujarat");

        LokSabha lokSabha=new LokSabha();
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
