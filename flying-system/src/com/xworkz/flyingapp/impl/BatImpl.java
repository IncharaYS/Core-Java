package com.xworkz.flyingapp.impl;

import com.xworkz.flyingapp.flying.Flying;

public class BatImpl implements Flying {
    @Override
    public void takeOff() {
        System.out.println("Bat takes off to fly");
    }

    @Override
    public void fly() {
        System.out.println("Bat takes flies");
    }

    @Override
    public void land() {
        System.out.println("Bat lands");
    }
}
