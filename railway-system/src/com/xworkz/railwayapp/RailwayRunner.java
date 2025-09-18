package com.xworkz.railwayapp;

import com.xworkz.railwayapp.impl.BulletTrainImpl;
import com.xworkz.railwayapp.railway.Railway;

public class RailwayRunner {
    public static void main(String[] args) {
        Railway railway=new BulletTrainImpl();
        railway.startTrain();
        railway.announceArrival();
        railway.stopTrain();
    }
}
