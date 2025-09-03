package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;
import com.xworkz.loksabhaapp.validator.PoliticianValidator;

public class LokSabha {
    Politician[] politicians=new Politician[12];
    int index;

    public boolean addPolitician(Politician politician){
        boolean isPoliticianAdded=false;

        PoliticianValidator politicianValidator=new PoliticianValidator();
        if(politicianValidator.validatePolitician(politician)){
            politicians[index++]=politician;
            isPoliticianAdded=true;
        }
        return isPoliticianAdded;
    }
    public void getPoliticianInfo() {
        for (Politician politician : politicians) {
            System.out.println("Politician ID is: " + politician.getPoliticianId());
            System.out.println("Politician name is: " +politician.getName());
            System.out.println("Politician age is: " +politician.getAge());
            System.out.println("Politician gender is: " +politician.getGender());
            System.out.println("Politician party is: " +politician.getParty());
            System.out.println("Politician state is: " +politician.getState()+"\n");
        }
    }
}
