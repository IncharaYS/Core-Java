package com.xworkz.sensorapp.impl;

import com.xworkz.sensorapp.sensor.Sensor;

public class TemperatureSensorImpl implements Sensor {
    @Override
    public void detect() {
        System.out.println("Temperature detected");
    }

    @Override
    public void calibrate() {
        System.out.println("Temperature is detected");
    }

    @Override
    public void reset() {
        System.out.println("Temperature is set to normal after use");
    }
}
