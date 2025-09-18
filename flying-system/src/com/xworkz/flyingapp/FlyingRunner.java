package com.xworkz.flyingapp;

import com.xworkz.flyingapp.flying.Flying;
import com.xworkz.flyingapp.impl.BatImpl;

public class FlyingRunner {
    public static void main(String[] args) {
        Flying flying=new BatImpl();
        flying.takeOff();
        flying.fly();
        flying.land();
    }
}
