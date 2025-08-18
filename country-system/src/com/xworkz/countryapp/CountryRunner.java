package com.xworkz.countryapp;

import com.xworkz.countryapp.country.Country;

public class CountryRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Country country1=new Country();
        country1.setCountryId(1);
        country1.setCode(91);
        country1.setContinent("Asia");
        country1.setCurrency("Rupee");
        country1.setName("India");

        System.out.println("Country Id is:"+country1.getCountryId());
        System.out.println("Country code is:"+country1.getCode());
        System.out.println("Country continent is:"+country1.getContinent());
        System.out.println("Country currency is:"+country1.getCurrency());
        System.out.println("Country name is:"+country1.getName());

        System.out.println("main ended");
    }
}
