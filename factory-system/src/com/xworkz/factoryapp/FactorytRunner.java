package com.xworkz.factoryapp;

import com.xworkz.factoryapp.factory.Factory;
import com.xworkz.factoryapp.impl.CarFactoryImpl;

public class FactorytRunner {
    public static void main(String[] args) {
        Factory factory=new CarFactoryImpl();
        factory.maintainQuality();
        factory.hireWorkers();
        factory.packProducts();
        factory.shipProducts();
    }
}
