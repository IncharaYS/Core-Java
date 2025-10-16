package com.xworkz.houseapp;

import com.xworkz.houseapp.house.House;
import java.util.ArrayList;
import java.util.List;

public class HouseRunner {
    public static void main(String[] args) {
        List<House> houseList = new ArrayList<>();

        houseList.add(new House(1,"MG Road, Bangalore",3,2,1500.0,7500000.0,"Ramesh"));
        houseList.add(new House(2,"Indiranagar, Bangalore",4,3,2000.0,12500000.0,"Suresh"));
        houseList.add(new House(3,"Whitefield, Bangalore",2,2,1200.0,6000000.0,"Mahesh"));
        houseList.add(new House(4,"Jayanagar, Bangalore",5,4,2500.0,15000000.0,"Rohit"));
        houseList.add(new House(5,"Koramangala, Bangalore",3,3,1800.0,9500000.0,"Amit"));
        houseList.add(new House(6,"HSR Layout, Bangalore",3,2,1600.0,8000000.0,"Vikram"));
        houseList.add(new House(7,"Electronic City, Bangalore",2,1,1000.0,5000000.0,"Anil"));
        houseList.add(new House(8,"Yelahanka, Bangalore",4,3,2200.0,13000000.0,"Rajesh"));
        houseList.add(new House(9,"Bellandur, Bangalore",3,2,1700.0,8500000.0,"Sunil"));
        houseList.add(new House(10,"Marathahalli, Bangalore",2,2,1400.0,7000000.0,"Manoj"));

        System.out.println("House list 1:");
        for(House house:houseList){
            System.out.println(house);
        }
        System.out.println();
        System.out.println("Size of House list 1:"+houseList.size());

        List<House> houseList2 = new ArrayList<>();

        houseList2.add(new House(11,"Kormangala, Bangalore",3,3,1750.0,9000000.0,"Deepak"));
        houseList2.add(new House(12,"Whitefield, Bangalore",2,2,1250.0,6500000.0,"Rajan"));
        houseList2.add(new House(13,"Hebbal, Bangalore",4,3,2100.0,13500000.0,"Sanjay"));
        houseList2.add(new House(14,"J P Nagar, Bangalore",3,2,1600.0,8000000.0,"Kiran"));
        houseList2.add(new House(15,"Rajajinagar, Bangalore",5,4,2600.0,15500000.0,"Arun"));
        houseList2.add(new House(16,"Hosur Road, Bangalore",3,3,1800.0,9500000.0,"Rakesh"));
        houseList2.add(new House(17,"Banaswadi, Bangalore",2,2,1200.0,6000000.0,"Vikas"));
        houseList2.add(new House(18,"Kanakapura Road, Bangalore",4,3,2300.0,14000000.0,"Naveen"));
        houseList2.add(new House(19,"KR Puram, Bangalore",3,2,1700.0,8500000.0,"Rohit"));
        houseList2.add(new House(20,"Domlur, Bangalore",2,2,1300.0,6500000.0,"Ajay"));

        System.out.println("House list 2:");
        for(House house:houseList2){
            System.out.println(house);
        }
        System.out.println();
        System.out.println("Size of House list 2:"+houseList2.size());

        houseList.addAll(houseList2);
        System.out.println("Full house list:");
        for(House house:houseList){
            System.out.println(house);
        }
        System.out.println();

        House house1 = new House(6,"HSR Layout, Bangalore",3,2,1600.0,8000000.0,"Vikram");
        House house2 = new House(21,"Whitefield, Bangalore",4,3,2000.0,12000000.0,"Karthik");
        houseList.add(4,house2);

        System.out.println("Does list contain house1:"+houseList.contains(house1));
        System.out.println("Does list contain houseList2:"+houseList.containsAll(houseList2));
        System.out.println();

        houseList.remove(house1);
        houseList.remove(7);

        System.out.println("House list after remove(Object) and remove(index):");
        for(House house:houseList){
            System.out.println(house);
        }
        System.out.println();

        houseList.removeAll(houseList2);
        System.out.println("House list after removing houseList2:");
        for(House house:houseList){
            System.out.println(house);
        }
        System.out.println();

        System.out.println("Does list contain house1:"+houseList.contains(house1));
        System.out.println("Does list contain houseList2:"+houseList.containsAll(houseList2));
        System.out.println();

        houseList.addAll(houseList2);
        houseList.retainAll(houseList2);

        System.out.println("House list after retaining only houseList2:");
        for(House house:houseList){
            System.out.println(house);
        }
        System.out.println();
    }
}
