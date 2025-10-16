package com.xworkz.parkapp;

import com.xworkz.parkapp.park.Park;
import java.util.ArrayList;
import java.util.List;

public class ParkRunner {
    public static void main(String[] args) {
        List<Park> parkList = new ArrayList<>();

        parkList.add(new Park("1","Cubbon Park","Bangalore",300.5,10000,true));
        parkList.add(new Park("2","Lalbagh","Bangalore",240.0,8000,true));
        parkList.add(new Park("3","Indira Park","Hyderabad",120.0,5000,true));
        parkList.add(new Park("4","Eco Park","Kolkata",400.0,15000,true));
        parkList.add(new Park("5","Nehru Park","Delhi",250.0,7000,true));
        parkList.add(new Park("6","Sanjeevaiah Park","Hyderabad",160.0,6000,true));
        parkList.add(new Park("7","Rock Garden","Chandigarh",100.0,4000,true));
        parkList.add(new Park("8","Hanging Garden","Mumbai",85.0,3500,true));
        parkList.add(new Park("9","Kamla Nehru Park","Pune",60.0,2500,true));
        parkList.add(new Park("10","Botanical Garden","Ooty",220.0,9000,true));

        System.out.println("Park list 1:");
        for(Park park:parkList){
            System.out.println(park);
        }
        System.out.println();
        System.out.println("Size of Park list 1:"+parkList.size());

        List<Park> parkList2 = new ArrayList<>();

        parkList2.add(new Park("11","Gandhi Park","Mysore",140.0,5500,true));
        parkList2.add(new Park("12","Children’s Park","Chennai",80.0,3000,true));
        parkList2.add(new Park("13","Rajiv Gandhi Park","Udaipur",110.0,4500,true));
        parkList2.add(new Park("14","Shivaji Park","Mumbai",190.0,6500,true));
        parkList2.add(new Park("15","Science Park","Kolkata",210.0,7200,true));
        parkList2.add(new Park("16","Rose Garden","Chandigarh",150.0,4800,true));
        parkList2.add(new Park("17","Marine Drive Park","Kochi",95.0,3200,true));
        parkList2.add(new Park("18","Victoria Park","Jaipur",180.0,6100,true));
        parkList2.add(new Park("19","Central Park","New York",843.0,20000,true));
        parkList2.add(new Park("20","Hyde Park","London",350.0,12000,true));

        System.out.println("Park list 2:");
        for(Park park:parkList2){
            System.out.println(park);
        }
        System.out.println();
        System.out.println("Size of Park list 2:"+parkList2.size());

        parkList.addAll(parkList2);
        System.out.println("Full park list:");
        for(Park park:parkList){
            System.out.println(park);
        }
        System.out.println();

        Park park1 = new Park("6","Sanjeevaiah Park","Hyderabad",160.0,6000,true);
        Park park2 = new Park("21","Wonder Park","Goa",175.0,5000,true);
        parkList.add(4,park2);

        System.out.println("Does list contain park1:"+parkList.contains(park1));
        System.out.println("Does list contain parkList2:"+parkList.containsAll(parkList2));
        System.out.println();

        parkList.remove(park1);
        parkList.remove(7);

        System.out.println("Park list after remove(Object) and remove(index):");
        for(Park park:parkList){
            System.out.println(park);
        }
        System.out.println();

        parkList.removeAll(parkList2);
        System.out.println("Park list after removing parkList2:");
        for(Park park:parkList){
            System.out.println(park);
        }
        System.out.println();

        System.out.println("Does list contain park1:"+parkList.contains(park1));
        System.out.println("Does list contain parkList2:"+parkList.containsAll(parkList2));
        System.out.println();

        parkList.addAll(parkList2);
        parkList.retainAll(parkList2);

        System.out.println("Park list after retaining only parkList2:");
        for(Park park:parkList){
            System.out.println(park);
        }
        System.out.println();
    }
}
