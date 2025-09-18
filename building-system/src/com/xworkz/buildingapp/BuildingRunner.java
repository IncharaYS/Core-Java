package com.xworkz.buildingapp;

import com.xworkz.buildingapp.building.Building;
import com.xworkz.buildingapp.impl.SchoolImpl;

import java.util.stream.BaseStream;

public class BuildingRunner  {
    public static void main(String[] args) {
        Building building=new SchoolImpl();
        building.installUtilities();
        building.maintain();
        building.getCapacity();
    }

}
