package com.xworkz.robotapp.impl;

import com.xworkz.robotapp.robot.Robot;

public class IndustrialRobotImpl implements Robot {
    @Override
    public void move() {
        System.out.println("Move mechanical arm");
    }

    @Override
    public void performTask() {
        System.out.println("Sort items by size");
    }

    @Override
    public void recharge() {
        System.out.println("Recharging industrial robot");
    }
}
