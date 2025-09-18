package cam.xworkz.deviceapp;

import cam.xworkz.deviceapp.device.Device;
import cam.xworkz.deviceapp.impl.PhoneImpl;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device=new PhoneImpl();
        device.powerOn();
        device.reset();
        device.powerOff();
    }
}
