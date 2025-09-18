package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.ecommerceplatform.EcommercePlatform;
import com.xworkz.ecommerceapp.impl.AmazonImpl;

public class EcommerceRunner {
    public static void main(String[] args) {
        EcommercePlatform ecommercePlatform=new AmazonImpl();
        ecommercePlatform.addToCart("Door");
        ecommercePlatform.checkout();
        ecommercePlatform.trackOrder();

    }
}
