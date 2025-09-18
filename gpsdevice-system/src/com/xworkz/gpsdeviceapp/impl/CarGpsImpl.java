package com.xworkz.gpsdeviceapp.impl;

import com.xworkz.gpsdeviceapp.gpsdevice.GpsDevice;

public class CarGpsImpl implements GpsDevice {
    @Override
    public void locate() {
        System.out.println("Locate car location");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to destination");
    }

    @Override
    public void updateMaps() {
        System.out.println("Update map for car");
    }
}
