package com.xworkz.powerplantapp;

import com.xworkz.powerplantapp.impl.NuclearPlantImpl;
import com.xworkz.powerplantapp.powerplant.PowerPlant;

public class PowerPlantRunner {
    public static void main(String[] args) {
        PowerPlant powerPlant=new NuclearPlantImpl();
        powerPlant.generatePower();
        powerPlant.monitorOutput();
        powerPlant.shutDown();
    }
}
