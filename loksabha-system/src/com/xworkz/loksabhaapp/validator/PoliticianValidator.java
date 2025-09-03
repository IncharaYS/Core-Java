package com.xworkz.loksabhaapp.validator;

import com.xworkz.loksabhaapp.politician.Politician;

public class PoliticianValidator {
    public boolean validatePolitician(Politician politician){
        boolean isPoliticianValidated=false;
        boolean isPoliticianIdValid=false;
        boolean isNameValid=false;
        boolean isGenderValid=false;
        boolean isAgeValid=false;
        boolean isStateValid=false;
        boolean isPartyValid=false;

        if(politician.getPoliticianId()>0) isPoliticianIdValid=true;
        else System.out.println("Entered ID is not valid");

        if (politician.getName()!=null&&!politician.getName().isEmpty()) isNameValid=true;
        else System.out.println("Entered name is not valid");

        if (politician.getAge()>25) isAgeValid=true;
        else System.out.println("Entered age is not valid");

        if(politician.getGender()!=null&&!politician.getGender().isEmpty()) isGenderValid=true;
        else System.out.println("Entered gender is not valid");

        if(politician.getParty()!=null&&!politician.getParty().isEmpty()) isPartyValid=true;
        else System.out.println("Entered party is not valid");

        if (politician.getState()!=null&&!politician.getState().isEmpty()) isStateValid=true;
        else System.out.println("Entered state is not valid");

        if(isAgeValid&&isGenderValid&&isNameValid&&isPoliticianIdValid&&isPartyValid&&isStateValid){
            isPoliticianValidated=true;
        }
        return  isPoliticianValidated;
    }
}
