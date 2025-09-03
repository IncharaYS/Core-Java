package com.xworkz.policestationapp.policestation;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.validator.PoliceValidator;

public class PoliceStation {
    Police[] polices=new Police[6];
    int index;

    public boolean addPolice(Police police){
        boolean isPoliceAdded=false;
        boolean isPoliceInfoValid=false;

        PoliceValidator policeValidator=new PoliceValidator();
        if(policeValidator.validatePolice(police)){
            isPoliceInfoValid=true;
            polices[index++]=police;
            isPoliceAdded=true;
        }
        return isPoliceAdded;
    }

    public void getPoliceInfo(){
        for(Police police:polices) {
            System.out.println("Police Id is:" + police.getPoliceId());
            System.out.println("Police name is:" + police.getName());
            System.out.println("Police gender is:" + police.getGender());
            System.out.println("Police rank is:" + police.getRank());
            System.out.println("Police shift is:" + police.getShift());
            System.out.println("Police department is:" +police.getDepartment()+"\n");
        }
    }
}
