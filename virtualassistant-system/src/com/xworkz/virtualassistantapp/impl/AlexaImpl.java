package com.xworkz.virtualassistantapp.impl;

import com.xworkz.virtualassistantapp.virtualassistance.VirtualAssistance;

public class AlexaImpl implements VirtualAssistance {
    @Override
    public void listen() {
        System.out.println("Alexa is listening");
    }

    @Override
    public void respond() {
        System.out.println("Alexa responds to request");
    }

    @Override
    public void scheduleTask() {
        System.out.println("Alexa schedules task");
    }
}
