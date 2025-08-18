package com.xworkz.busstandapp;

import com.xworkz.busstandapp.busstand.BusStand;

public class BusStandRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        BusStand busStand1=new BusStand();
        busStand1.setBusStandId(1);
        busStand1.setLocation("Rajajinagar");
        busStand1.setName("Mariappanpalya");
        busStand1.setBusRoute("Vijaynagara-Malleshwaram");

        System.out.println("Bus stand Id is: "+busStand1.getBusStandId());
        System.out.println("Bus stand location is: "+busStand1.getLocation());
        System.out.println("Bus stand name is: "+busStand1.getName());
        System.out.println("Bus stand bus route is: "+busStand1.getBusRoute());


        System.out.println("main ended");
    }
}
