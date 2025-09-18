package com.xworkz.deliveryapp;

import com.xworkz.deliveryapp.deliveryapp.DeliveryApp;
import com.xworkz.deliveryapp.impl.BlinkItImpl;

public class DeliveryPlatformRunner {
    public static void main(String[] args) {
        DeliveryApp deliveryApp=new BlinkItImpl();
        deliveryApp.pickUp();
        deliveryApp.transport();
        deliveryApp.deliver();
    }
}
