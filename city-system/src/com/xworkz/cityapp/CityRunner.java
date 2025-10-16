package com.xworkz.cityapp;

import com.xworkz.cityapp.city.City;
import java.util.ArrayList;
import java.util.List;

public class CityRunner {
    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();

        cityList.add(new City(1, "Bangalore", "Karnataka", 12000000, 709.0, true));
        cityList.add(new City(2, "Hyderabad", "Telangana", 10000000, 650.0, true));
        cityList.add(new City(3, "Chennai", "Tamil Nadu", 9000000, 426.0, true));
        cityList.add(new City(4, "Pune", "Maharashtra", 7000000, 331.0, false));
        cityList.add(new City(5, "Delhi", "Delhi", 19000000, 1484.0, true));
        cityList.add(new City(6, "Mumbai", "Maharashtra", 20000000, 603.0, true));
        cityList.add(new City(7, "Kolkata", "West Bengal", 15000000, 205.0, true));
        cityList.add(new City(8, "Bhubaneswar", "Odisha", 900000, 67.0, true));
        cityList.add(new City(9, "Jaipur", "Rajasthan", 3500000, 484.0, true));
        cityList.add(new City(10, "Ahmedabad", "Gujarat", 8000000, 464.0, false));

        System.out.println("City list 1:");
        for(City city : cityList){
            System.out.println(city);
        }
        System.out.println();
        System.out.println("Size of City list 1:" + cityList.size());

        List<City> cityList2 = new ArrayList<>();

        cityList2.add(new City(11, "Bhopal", "Madhya Pradesh", 1800000, 277.0, true));
        cityList2.add(new City(12, "Lucknow", "Uttar Pradesh", 2800000, 631.0, true));
        cityList2.add(new City(13, "Chandigarh", "Chandigarh", 1100000, 114.0, true));
        cityList2.add(new City(14, "Surat", "Gujarat", 6000000, 326.0, false));
        cityList2.add(new City(15, "Indore", "Madhya Pradesh", 3500000, 530.0, false));
        cityList2.add(new City(16, "Visakhapatnam", "Andhra Pradesh", 2300000, 681.0, false));
        cityList2.add(new City(17, "Patna", "Bihar", 2100000, 320.0, true));
        cityList2.add(new City(18, "Nagpur", "Maharashtra", 2400000, 227.0, false));
        cityList2.add(new City(19, "Coimbatore", "Tamil Nadu", 2000000, 246.0, false));
        cityList2.add(new City(20, "Mysore", "Karnataka", 1000000, 128.0, false));

        System.out.println("City list 2:");
        for(City city : cityList2){
            System.out.println(city);
        }
        System.out.println();
        System.out.println("Size of City list 2:" + cityList2.size());

        cityList.addAll(cityList2);
        System.out.println("Full city list:");
        for(City city : cityList){
            System.out.println(city);
        }
        System.out.println();

        City city1 = new City(6, "Mumbai", "Maharashtra", 20000000, 603.0, true);
        City city2 = new City(21, "Noida", "Uttar Pradesh", 650000, 203.0, false);
        cityList.add(4, city2);

        System.out.println("Does list contain city1:" + cityList.contains(city1));
        System.out.println("Does list contain cityList2:" + cityList.containsAll(cityList2));
        System.out.println();

        cityList.remove(city1);
        cityList.remove(7);

        System.out.println("City list after remove(Object) and remove(index):");
        for(City city : cityList){
            System.out.println(city);
        }
        System.out.println();

        cityList.removeAll(cityList2);
        System.out.println("City list after removing cityList2:");
        for(City city : cityList){
            System.out.println(city);
        }
        System.out.println();

        System.out.println("Does list contain city1:" + cityList.contains(city1));
        System.out.println("Does list contain cityList2:" + cityList.containsAll(cityList2));
        System.out.println();

        cityList.addAll(cityList2);
        cityList.retainAll(cityList2);

        System.out.println("City list after retaining only cityList2:");
        for(City city : cityList){
            System.out.println(city);
        }
        System.out.println();
    }
}
