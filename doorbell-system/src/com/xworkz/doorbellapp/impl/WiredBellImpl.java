package com.xworkz.doorbellapp.impl;

import com.xworkz.doorbellapp.doorbell.DoorBell;

public class WiredBellImpl implements DoorBell {
    @Override
    public void ring() {
        System.out.println("Wireless door bell rings");
    }

    @Override
    public void stopRing() {
        System.out.println("Wireless door bell stops ringing");
    }

    @Override
    public void changeTone() {
        System.out.println("Tone changed");
    }
}
