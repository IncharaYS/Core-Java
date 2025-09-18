package com.xworks.remoteapp;

import com.xworks.remoteapp.impl.TvRemoteImpl;
import com.xworks.remoteapp.remote.Remote;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote=new TvRemoteImpl();
        remote.powerOn();
        remote.powerOff();
        remote.ChangeSettings();
    }
}
