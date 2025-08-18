package com.xworkz.apartmentapp;

import com.xworkz.apartmentapp.apartment.Apartment;

public class ApartmentRunner {
    public static void main(String[] args) {
        System.out.println("main stated");

        Apartment apartment1=new Apartment();
        apartment1.setApartmentId(1);
        apartment1.setLocation("Rajajinagar");
        apartment1.setName("Shravani");
        apartment1.setHasElevator(true);
        apartment1.setYearBuilt(2006);

        System.out.println("Apartment Id is: "+apartment1.getApartmentId());
        System.out.println("Apartment Location is: "+apartment1.getLocation());
        System.out.println("Apartment Name is: "+apartment1.getName());
        System.out.println("Apartment has elevator?: "+apartment1.getIsHasElevator());
        System.out.println("Apartment built in year: "+apartment1.getYearBuilt());

        System.out.println("main ended");
    }
}
