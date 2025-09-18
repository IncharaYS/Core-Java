package com.xworkz.robotapp;

import com.xworkz.robotapp.impl.IndustrialRobotImpl;
import com.xworkz.robotapp.robot.Robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot=new IndustrialRobotImpl();
        robot.move();
        robot.performTask();
        robot.recharge();
    }
}
