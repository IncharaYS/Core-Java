package com.xworkz.policestationapp;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        Police police=new Police();
        police.setPoliceId(1);
        police.setName("Shahank");
        police.setGender("Male");
        police.setRank("Head constable");
        police.setShift("Day");
        police.setDepartment("Crime");

        PoliceStation policeStation=new PoliceStation();
        if (policeStation.addPolice(police)){
            policeStation.getPoliceInfo();
        }
        else System.out.println("Police not added");
    }
}
