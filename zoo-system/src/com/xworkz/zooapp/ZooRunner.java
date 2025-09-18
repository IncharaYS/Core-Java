package com.xworkz.zooapp;

import com.xworkz.zooapp.impl.SafariZooImpl;
import com.xworkz.zooapp.zoo.Zoo;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo zoo=new SafariZooImpl();
        zoo.allowVisitors();
        zoo.cleanEnclosures();
        zoo.feedAnimals();
    }
}
