package com.xworkz.portapp;

import com.xworkz.portapp.impl.SeaPortImpl;
import com.xworkz.portapp.port.Port;

public class PortRunner {
    public static void main(String[] args) {
        Port port=new SeaPortImpl();
        port.dockShip();
        port.unloadCargo();
        port.releaseShip();
    }
}
