package com.xworkz.steeringapp.impl;

import com.xworkz.steeringapp.steering.Steering;

public class PowerSteeringImpl implements Steering {
    @Override
    public void turnLeft() {
        System.out.println("turing left using power steering");
    }

    @Override
    public void turnRight() {
        System.out.println("turing right using power steering");
    }

    @Override
    public void straighten() {
        System.out.println("keeping straight using power steering");
    }
}
