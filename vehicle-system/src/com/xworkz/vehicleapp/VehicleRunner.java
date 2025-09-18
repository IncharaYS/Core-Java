package com.xworkz.vehicleapp;

import com.xworkz.vehicleapp.impl.CarImpl;
import com.xworkz.vehicleapp.vehicle.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle=new CarImpl();
        vehicle.accelerate();
        vehicle.start();
        vehicle.stop();
    }
}
