package com.xworkz.doorbellapp;

import com.xworkz.doorbellapp.doorbell.DoorBell;
import com.xworkz.doorbellapp.impl.WiredBellImpl;

public class DoorBellRunner {
    public static void main(String[] args) {
        DoorBell doorBell=new WiredBellImpl();
        doorBell.ring();
        doorBell.stopRing();
        doorBell.changeTone();
    }
}
