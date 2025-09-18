package com.xworkz.factoryapp.impl;

import com.xworkz.factoryapp.factory.Factory;

public class CarFactoryImpl implements Factory {
    @Override
    public void hireWorkers() {
        System.out.println("Hire workers at car factory");
    }

    @Override
    public void maintainQuality() {
        System.out.println("Maintain quality at car factory");
    }

    @Override
    public void packProducts() {
        System.out.println("Pack products at car factory");
    }

    @Override
    public void shipProducts() {
        System.out.println("ship cars from car factory");
    }
}
