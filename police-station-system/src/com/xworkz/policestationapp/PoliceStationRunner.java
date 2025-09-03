package com.xworkz.policestationapp;

import com.xworkz.policestationapp.police.Police;
import com.xworkz.policestationapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        Police police1=new Police();
        police1.setPoliceId(1);
        police1.setName("Shahank");
        police1.setGender("Male");
        police1.setRank("Head constable");
        police1.setShift("Day");
        police1.setDepartment("Crime");

        PoliceStation policeStation=new PoliceStation();
        policeStation.addPolice(police1);

        Police police2=new Police(2,"Rashmi","Female","Sub inspector","Crime","Night");
        policeStation.addPolice(police2);

        Police police3=new Police(3,"Amit","Male","Inspector","Traffic","Day");
        policeStation.addPolice(police3);

        Police police4=new Police(4,"Sneha","Female","Constable","Patrol","Night");
        policeStation.addPolice(police4);

        Police police5=new Police(5,"Rohan","Male","Head Constable","Investigation","Day");
        policeStation.addPolice(police5);

        Police police6=new Police(6,"Priya","Female","Assistant Sub Inspector","Cyber Crime","Day");
        policeStation.addPolice(police6);

        policeStation.getPoliceInfo();

        /*if (policeStation.addPolice(police)){
            policeStation.getPoliceInfo();
        }
        else System.out.println("Police not added");*/
    }
}
