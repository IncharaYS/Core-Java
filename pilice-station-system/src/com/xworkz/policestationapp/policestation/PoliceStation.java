package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.validator.PoliceValidator;

public class PoliceStation {
    Police police;
    public boolean addPolice(Police police){
        boolean isPoliceAdded=false;
        boolean isPoliceInfoValid=false;

        PoliceValidator policeValidator=new PoliceValidator();
        if(policeValidator.validatePolice(police)){
            isPoliceInfoValid=true;
            this.police=police;
            isPoliceAdded=true;
        }
        return isPoliceAdded;
    }

    public void getPoliceInfo(){
        System.out.println("Police Id is:"+this.police.getPoliceId());
        System.out.println("Police name is:"+this.police.getName());
        System.out.println("Police gender is:"+this.police.getGender());
        System.out.println("Police rank is:"+this.police.getRank());
        System.out.println("Police shift is:"+this.police.getShift());
        System.out.println("Police department is:"+this.police.getDepartment());
    }
}
