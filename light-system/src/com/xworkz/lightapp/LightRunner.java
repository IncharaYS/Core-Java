package com.xworkz.lightapp;

import com.xworkz.lightapp.impl.HeadLightImpl;
import com.xworkz.lightapp.light.Light;

public class LightRunner {
    public static void main(String[] args) {
        Light light=new HeadLightImpl();
        light.switchOn();
        light.adjustBrightness();
        light.switchOff();
    }
}
