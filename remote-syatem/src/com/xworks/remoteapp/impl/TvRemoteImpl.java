package com.xworks.remoteapp.impl;

import com.xworks.remoteapp.remote.Remote;

public class TvRemoteImpl implements Remote {
    @Override
    public void powerOn() {
        System.out.println("Powering TV On");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning TV off");
    }

    @Override
    public void ChangeSettings() {
        System.out.println("Changing volume");
    }
}
