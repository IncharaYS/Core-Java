package com.xworkz.sensorapp;

import com.xworkz.sensorapp.impl.TemperatureSensorImpl;
import com.xworkz.sensorapp.sensor.Sensor;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor=new TemperatureSensorImpl();
        sensor.detect();
        sensor.calibrate();
        sensor.reset();
    }
}
