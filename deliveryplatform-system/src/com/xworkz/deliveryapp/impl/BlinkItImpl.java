package com.xworkz.deliveryapp.impl;

import com.xworkz.deliveryapp.deliveryapp.DeliveryApp;

public class BlinkItImpl implements DeliveryApp {
    @Override
    public void pickUp() {
        System.out.println("Picking up items");
    }

    @Override
    public void transport() {
        System.out.println("Transporting items to delivery location");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering items");
    }
}
