package com.xworkz.virtualassistantapp;

import com.xworkz.virtualassistantapp.impl.AlexaImpl;
import com.xworkz.virtualassistantapp.virtualassistance.VirtualAssistance;

public class VirtualAssistanceRunner {
    public static void main(String[] args) {
        VirtualAssistance virtualAssistance=new AlexaImpl();
        virtualAssistance.listen();
        virtualAssistance.respond();
        virtualAssistance.scheduleTask();
    }
}
