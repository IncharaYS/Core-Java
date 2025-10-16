package com.xworkz.carapp;

import com.xworkz.carapp.car.Car;
import java.util.ArrayList;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("1","Toyota","Fortuner",4200000.0,"Diesel",true));
        carList.add(new Car("2","Hyundai","Creta",1800000.0,"Petrol",true));
        carList.add(new Car("3","Tata","Nexon",1500000.0,"Petrol",false));
        carList.add(new Car("4","Mahindra","XUV700",2500000.0,"Diesel",true));
        carList.add(new Car("5","Kia","Seltos",1700000.0,"Petrol",true));
        carList.add(new Car("6","Maruti","Baleno",1100000.0,"Petrol",false));
        carList.add(new Car("7","Honda","City",1600000.0,"Petrol",true));
        carList.add(new Car("8","Skoda","Kushaq",1900000.0,"Petrol",true));
        carList.add(new Car("9","Volkswagen","Virtus",2000000.0,"Petrol",true));
        carList.add(new Car("10","MG","Hector",2200000.0,"Diesel",true));

        System.out.println("Car list 1:");
        for(Car car:carList){
            System.out.println(car);
        }
        System.out.println();
        System.out.println("Size of Car list 1:"+carList.size());

        List<Car> carList2 = new ArrayList<>();

        carList2.add(new Car("11","BMW","X5",7500000.0,"Diesel",true));
        carList2.add(new Car("12","Audi","Q7",8500000.0,"Petrol",true));
        carList2.add(new Car("13","Mercedes","GLA",6800000.0,"Diesel",true));
        carList2.add(new Car("14","Jeep","Compass",3000000.0,"Petrol",true));
        carList2.add(new Car("15","Nissan","Magnite",1200000.0,"Petrol",false));
        carList2.add(new Car("16","Ford","Endeavour",3500000.0,"Diesel",true));
        carList2.add(new Car("17","Renault","Kiger",1100000.0,"Petrol",false));
        carList2.add(new Car("18","Hyundai","Verna",1600000.0,"Petrol",true));
        carList2.add(new Car("19","Toyota","Innova Crysta",3200000.0,"Diesel",true));
        carList2.add(new Car("20","Tata","Harrier",2400000.0,"Diesel",true));

        System.out.println("Car list 2:");
        for(Car car:carList2){
            System.out.println(car);
        }
        System.out.println();
        System.out.println("Size of Car list 2:"+carList2.size());

        carList.addAll(carList2);
        System.out.println("Full car list:");
        for(Car car:carList){
            System.out.println(car);
        }
        System.out.println();

        Car car1 = new Car("6","Maruti","Baleno",1100000.0,"Petrol",false);
        Car car2 = new Car("21","Tesla","Model 3",6000000.0,"Electric",true);
        carList.add(4,car2);

        System.out.println("Does list contain car1:"+carList.contains(car1));
        System.out.println("Does list contain carList2:"+carList.containsAll(carList2));
        System.out.println();

        carList.remove(car1);
        carList.remove(7);

        System.out.println("Car list after remove(Object) and remove(index):");
        for(Car car:carList){
            System.out.println(car);
        }
        System.out.println();

        carList.removeAll(carList2);
        System.out.println("Car list after removing carList2:");
        for(Car car:carList){
            System.out.println(car);
        }
        System.out.println();

        System.out.println("Does list contain car1:"+carList.contains(car1));
        System.out.println("Does list contain carList2:"+carList.containsAll(carList2));
        System.out.println();

        carList.addAll(carList2);
        carList.retainAll(carList2);

        System.out.println("Car list after retaining only carList2:");
        for(Car car:carList){
            System.out.println(car);
        }
        System.out.println();
    }
}
