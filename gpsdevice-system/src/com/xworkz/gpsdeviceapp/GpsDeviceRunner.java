package com.xworkz.gpsdeviceapp;

import com.xworkz.gpsdeviceapp.gpsdevice.GpsDevice;
import com.xworkz.gpsdeviceapp.impl.CarGpsImpl;

public class GpsDeviceRunner {
    public static void main(String[] args) {
        GpsDevice gpsDevice=new CarGpsImpl();
        gpsDevice.locate();
        gpsDevice.navigate();
        gpsDevice.updateMaps();
    }
}
