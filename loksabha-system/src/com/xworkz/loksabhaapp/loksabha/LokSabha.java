package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;
import com.xworkz.loksabhaapp.validator.PoliticianValidator;

public class LokSabha {
    Politician politician;
    public boolean addPolitician(Politician politician){
        boolean isPoliticianAdded=false;

        PoliticianValidator politicianValidator=new PoliticianValidator();
        if(politicianValidator.validatePolitician(politician)){
            this.politician=politician;
            isPoliticianAdded=true;
        }
        return isPoliticianAdded;
    }
    public void getPoliticianInfo(){
        System.out.println("Politician ID is: "+this.politician.getPoliticianId());
        System.out.println("Politician name is: "+this.politician.getName());
        System.out.println("Politician age is: "+this.politician.getAge());
        System.out.println("Politician gender is: "+this.politician.getGender());
        System.out.println("Politician party is: "+this.politician.getParty());
        System.out.println("Politician state is: "+this.politician.getState());
    }
}
