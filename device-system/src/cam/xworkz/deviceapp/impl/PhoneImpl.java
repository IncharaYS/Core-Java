package cam.xworkz.deviceapp.impl;

import cam.xworkz.deviceapp.device.Device;

public class PhoneImpl implements Device {
    @Override
    public void powerOn() {
        System.out.println("Turning phone on");
    }

    @Override
    public void powerOff() {
        System.out.println("Turing phone off");
    }

    @Override
    public void reset() {
        System.out.println("Resetting phone");
    }
}
