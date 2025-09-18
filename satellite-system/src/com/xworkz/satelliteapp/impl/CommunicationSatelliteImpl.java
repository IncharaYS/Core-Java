package com.xworkz.satelliteapp.impl;

import com.xworkz.satelliteapp.satellite.Satellite;

public class CommunicationSatelliteImpl implements Satellite {
    @Override
    public void launch() {
        System.out.println("Launching communication satellite");
    }

    @Override
    public void transmitData() {
        System.out.println("Transmitting using communication satellite");
    }

    @Override
    public void orbit() {
        System.out.println("communication satellite orbiting earth");
    }
}
