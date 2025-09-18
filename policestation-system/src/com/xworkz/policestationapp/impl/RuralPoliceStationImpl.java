package com.xworkz.policestationapp.impl;

import com.xworkz.policestationapp.policestation.PoliceStation;

public class RuralPoliceStationImpl implements PoliceStation {
    @Override
    public void fileComplaint() {
        System.out.println("File complaint at rural police station");
    }

    @Override
    public void investigateCase() {
        System.out.println("Investigate case at rural police station");
    }

    @Override
    public void arrestSuspect() {
        System.out.println("Arrest suspect at rural police station");
    }
}
