package com.xworkz.buildingapp.impl;

import com.xworkz.buildingapp.building.Building;

public class SchoolImpl implements Building {
    @Override
    public void installUtilities() {
        System.out.println("Installing utilities in school");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining the school");
    }

    @Override
    public void getCapacity() {
        System.out.println("capacity of school is:500");
    }
}
