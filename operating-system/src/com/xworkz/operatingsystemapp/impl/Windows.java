package com.xworkz.operatingsystemapp.impl;

import com.xworkz.operatingsystemapp.operatingsystem.OperatingSystem;

public class Windows implements OperatingSystem {

    @Override
    public void boot() {
        System.out.println("Windows booting");
    }

    @Override
    public void shutdown() {
        System.out.println("Windows shutting down");
    }

    @Override
    public void restart() {
        System.out.println("Windows restarting");
    }
}
