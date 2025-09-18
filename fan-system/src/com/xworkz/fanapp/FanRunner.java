package com.xworkz.fanapp;

import com.xworkz.fanapp.fan.Fan;
import com.xworkz.fanapp.impl.TableFanImpl;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan=new TableFanImpl();
        fan.start();
        fan.adjustSpeed();
        fan.stop();
    }
}
