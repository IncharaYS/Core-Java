package com.xworkz.steeringapp;

import com.xworkz.steeringapp.impl.PowerSteeringImpl;
import com.xworkz.steeringapp.steering.Steering;

public class SteeringRunner {
    public static void main(String[] args) {
        Steering steering=new PowerSteeringImpl();
        steering.turnLeft();
        steering.straighten();
        steering.turnLeft();
    }
}
