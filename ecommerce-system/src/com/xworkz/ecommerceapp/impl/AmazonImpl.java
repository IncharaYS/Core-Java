package com.xworkz.ecommerceapp.impl;

import com.xworkz.ecommerceapp.ecommerceplatform.EcommercePlatform;

public class AmazonImpl implements EcommercePlatform {
    @Override
    public void addToCart(String item) {
        System.out.println("Item "+item+ " added to cart");
    }

    @Override
    public void checkout() {
        System.out.println("Checking out");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking order");
    }
}
