package com.xworkz.droneapp;

import com.xworkz.droneapp.drone.Drone;
import com.xworkz.droneapp.impl.MilitaryDroneImpl;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone=new MilitaryDroneImpl();
        drone.fly();
        drone.land();
        drone.takeOff();
    }
}
