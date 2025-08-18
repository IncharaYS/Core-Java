package com.xworkz.parkapp;

import com.xworkz.parkapp.park.Park;

public class ParkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Park park1=new Park();
        park1.setParkId(1);
        park1.setLocation("Rajajinagar");
        park1.setOpeningTime("7:00AM");
        park1.setClosingTime("10:00PM");
        park1.setHasPlayGround(true);

        System.out.println("Park Id is: "+park1.getParkId());
        System.out.println("Park location is: "+park1.getLocation());
        System.out.println("Park opening time is: "+park1.getOpeningTime());
        System.out.println("Park closing time is: "+park1.getOpeningTime());
        System.out.println("Park has playground?: "+park1.getIsHasPlayGround());

        System.out.println("main ended");
    }
}
