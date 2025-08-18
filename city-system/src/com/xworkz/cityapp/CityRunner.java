package com.xworkz.cityapp;

import com.xworkz.cityapp.city.City;

public class CityRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        City city1=new City();

        city1.setCityId(1);
        city1.setName("Bangalore");
        city1.setPinCode(560056);
        city1.setState("Karnataka");

        System.out.println("City Id is: "+city1.getCityId());
        System.out.println("City name is: "+city1.getName());
        System.out.println("City pin code is: "+city1.getPinCode());
        System.out.println("City state is: "+city1.getState());

        System.out.println("main ended");
    }
}
