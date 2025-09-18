package com.xworkz.portapp.impl;

import com.xworkz.portapp.port.Port;

public class SeaPortImpl implements Port {
    @Override
    public void dockShip() {
        System.out.println("Docking ship from sea");
    }

    @Override
    public void unloadCargo() {
        System.out.println("Unloading cargo from sea");
    }

    @Override
    public void releaseShip() {
        System.out.println("Release ship to the sea");
    }
}
