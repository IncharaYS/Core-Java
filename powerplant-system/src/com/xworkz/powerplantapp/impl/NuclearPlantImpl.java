package com.xworkz.powerplantapp.impl;

import com.xworkz.powerplantapp.powerplant.PowerPlant;

public class NuclearPlantImpl implements PowerPlant {
    @Override
    public void generatePower() {
        System.out.println("Generating power in nuclear power plant");
    }

    @Override
    public void monitorOutput() {
        System.out.println("Monitoring output  in nuclear power plant");
    }

    @Override
    public void shutDown() {
        System.out.println("Closing nuclear power plant");
    }
}
