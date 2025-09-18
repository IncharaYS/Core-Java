package com.xworkz.policestationapp;

import com.xworkz.policestationapp.impl.RuralPoliceStationImpl;
import com.xworkz.policestationapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        PoliceStation policeStation=new RuralPoliceStationImpl();
        policeStation.fileComplaint();
        policeStation.arrestSuspect();
        policeStation.investigateCase();
    }
}
