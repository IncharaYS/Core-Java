package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.LokSabha;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokSabhaRunner {
    public static void main(String[] args) {
        Politician politician=new Politician();
        politician.setPoliticianId(1);
        politician.setAge(74);
        politician.setGender("Male");
        politician.setParty("BJP");
        politician.setName("Narendra Modi");
        politician.setState("Gujarat");

        LokSabha lokSabha=new LokSabha();
        if(lokSabha.addPolitician(politician)) lokSabha.getPoliticianInfo();
        else System.out.println("Politician is not added");
    }
}
