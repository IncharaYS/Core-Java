package com.xworkz.antivirusapp.impl;

import com.xworkz.antivirusapp.antivirus.AntiVirus;

public class NortonImpl implements AntiVirus {
    @Override
    public void scan() {
        System.out.println("Scanning for virus using norton");
    }

    @Override
    public void removeThreats() {
        System.out.println("Removing threats using norton");
    }

    @Override
    public void update() {
        System.out.println("Updating norton");
    }
}
