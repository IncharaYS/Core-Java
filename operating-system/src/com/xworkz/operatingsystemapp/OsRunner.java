package com.xworkz.operatingsystemapp;

import com.xworkz.operatingsystemapp.impl.Windows;
import com.xworkz.operatingsystemapp.operatingsystem.OperatingSystem;

public class OsRunner {
    public static void main(String[] args) {
        OperatingSystem operatingSystem=new Windows();
        operatingSystem.boot();
        operatingSystem.restart();
        operatingSystem.shutdown();
    }
}
