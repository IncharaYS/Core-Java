package com.xworkz.lightapp.impl;

import com.xworkz.lightapp.light.Light;

public class HeadLightImpl implements Light {
    @Override
    public void switchOn() {
        System.out.println("Head light turned on");
    }

    @Override
    public void switchOff() {
        System.out.println("Head light turned off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Rightness changed");
    }
}
