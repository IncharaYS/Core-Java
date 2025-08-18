package com.xworkz.riverapp;

import com.xworkz.riverapp.river.River;

public class RiverRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        River river1=new River();
        river1.setRiverId(1);
        river1.setLocation("Shivamogga");
        river1.setHasDam(true);
        river1.setState("Karnataka");
        river1.setOrigin("Western ghats");

        System.out.println("River Id is: "+river1.getRiverId());
        System.out.println("River location is: "+river1.getLocation());
        System.out.println("River has dam?: "+river1.getIsHasDam());
        System.out.println("River state is: "+river1.getState());
        System.out.println("River origin is: "+river1.getOrigin());

        System.out.println("main ended");
    }
}
