package com.xworkz.zooapp.impl;

import com.xworkz.zooapp.zoo.Zoo;

public class SafariZooImpl implements Zoo {
    @Override
    public void feedAnimals() {
        System.out.println("Feeding animals at safari zoo");
    }

    @Override
    public void cleanEnclosures() {
        System.out.println("Clean enclosures at safari zoo");
    }

    @Override
    public void allowVisitors() {
        System.out.println("Allow visitors at safari zoo");
    }
}
