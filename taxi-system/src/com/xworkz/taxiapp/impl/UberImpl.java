package com.xworkz.taxiapp.impl;

import com.xworkz.taxiapp.taxi.Taxi;

public class UberImpl implements Taxi {
    @Override
    public void bookRide() {
        System.out.println("Booking ride with uber");
    }

    @Override
    public void startRide() {
        System.out.println("Starting ride with uber");
    }

    @Override
    public void endRide() {
        System.out.println("End ride with uber");
    }
}
