package com.xworkz.satelliteapp;

import com.xworkz.satelliteapp.impl.CommunicationSatelliteImpl;
import com.xworkz.satelliteapp.satellite.Satellite;

public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite=new CommunicationSatelliteImpl();
        satellite.launch();
        satellite.orbit();
        satellite.transmitData();
    }
}
