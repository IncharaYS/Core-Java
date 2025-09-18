package com.xworkz.railwayapp.impl;

import com.xworkz.railwayapp.railway.Railway;

public class BulletTrainImpl implements Railway {
    @Override
    public void startTrain() {
        System.out.println("Bullet train starts");
    }

    @Override
    public void stopTrain() {
        System.out.println("Bullet train stops");
    }

    @Override
    public void announceArrival() {
        System.out.println("Bullet train is arriving announcement");
    }
}
