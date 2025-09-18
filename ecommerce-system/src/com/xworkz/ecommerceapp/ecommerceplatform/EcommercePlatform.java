package com.xworkz.ecommerceapp.ecommerceplatform;

public interface EcommercePlatform {
    void addToCart(String item);
    void checkout();
    void trackOrder();
}
