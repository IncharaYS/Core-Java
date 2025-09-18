package com.xworkz.fanapp.impl;

import com.xworkz.fanapp.fan.Fan;

public class TableFanImpl implements Fan {
    @Override
    public void start() {
        System.out.println("Table fan started");
    }

    @Override
    public void stop() {
        System.out.println("Table fan stopped");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("Table fan speed reduced");
    }
}
