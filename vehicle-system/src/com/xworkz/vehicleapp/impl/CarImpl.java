package com.xworkz.vehicleapp.impl;

import com.xworkz.vehicleapp.vehicle.Vehicle;

public class CarImpl implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with ignition");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with breaks");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates forward");
    }
}
