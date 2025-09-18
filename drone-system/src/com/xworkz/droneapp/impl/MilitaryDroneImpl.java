package com.xworkz.droneapp.impl;

import com.xworkz.droneapp.drone.Drone;

public class MilitaryDroneImpl implements Drone {
    @Override
    public void takeOff() {
        System.out.println("Military drone taking off");
    }

    @Override
    public void fly() {
        System.out.println("Military drone scouting");
    }

    @Override
    public void land() {
        System.out.println("Military drone landing");
    }
}
