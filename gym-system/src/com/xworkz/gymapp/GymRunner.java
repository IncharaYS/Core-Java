package com.xworkz.gymapp;

import com.xworkz.gymapp.gym.Gym;
import java.util.ArrayList;
import java.util.List;

public class GymRunner {
    public static void main(String[] args) {
        List<Gym> gymList = new ArrayList<>();

        gymList.add(new Gym(1, "Gold's Gym", "Bangalore", 500, 2500.0, "Ramesh"));
        gymList.add(new Gym(2, "Anytime Fitness", "Hyderabad", 300, 2000.0, "Suresh"));
        gymList.add(new Gym(3, "Talwalkars", "Mumbai", 400, 2200.0, "Mahesh"));
        gymList.add(new Gym(4, "Fitness First", "Pune", 350, 2100.0, "Rohit"));
        gymList.add(new Gym(5, "Snap Fitness", "Chennai", 250, 1800.0, "Amit"));
        gymList.add(new Gym(6, "Powerhouse Gym", "Delhi", 600, 2700.0, "Vikram"));
        gymList.add(new Gym(7, "Bodyline Gym", "Kolkata", 200, 1500.0, "Anil"));
        gymList.add(new Gym(8, "Ozone Fitness", "Bangalore", 300, 2300.0, "Rajesh"));
        gymList.add(new Gym(9, "Impulse Gym", "Hyderabad", 450, 2400.0, "Sunil"));
        gymList.add(new Gym(10, "Muscle Factory", "Chennai", 350, 2250.0, "Manoj"));

        System.out.println("Gym list 1:");
        for(Gym gym : gymList){
            System.out.println(gym);
        }
        System.out.println();
        System.out.println("Size of Gym list 1:" + gymList.size());

        List<Gym> gymList2 = new ArrayList<>();

        gymList2.add(new Gym(11, "Fitness World", "Pune", 300, 2100.0, "Deepak"));
        gymList2.add(new Gym(12, "Reebok Gym", "Mumbai", 400, 2500.0, "Rajan"));
        gymList2.add(new Gym(13, "Urban Gym", "Delhi", 350, 2200.0, "Sanjay"));
        gymList2.add(new Gym(14, "Gold's Gym", "Chennai", 200, 2000.0, "Kiran"));
        gymList2.add(new Gym(15, "Fitternity Gym", "Bangalore", 450, 2600.0, "Arun"));
        gymList2.add(new Gym(16, "Pro Gym", "Hyderabad", 300, 2100.0, "Rakesh"));
        gymList2.add(new Gym(17, "Iron Paradise", "Mumbai", 500, 2700.0, "Vikas"));
        gymList2.add(new Gym(18, "Body Craft", "Pune", 250, 1900.0, "Naveen"));
        gymList2.add(new Gym(19, "Fitness Hub", "Chennai", 350, 2250.0, "Rohit"));
        gymList2.add(new Gym(20, "Muscle Mania", "Delhi", 400, 2400.0, "Ajay"));

        System.out.println("Gym list 2:");
        for(Gym gym : gymList2){
            System.out.println(gym);
        }
        System.out.println();
        System.out.println("Size of Gym list 2:" + gymList2.size());

        gymList.addAll(gymList2);
        System.out.println("Full gym list:");
        for(Gym gym : gymList){
            System.out.println(gym);
        }
        System.out.println();

        Gym gym1 = new Gym(6, "Powerhouse Gym", "Delhi", 600, 2700.0, "Vikram");
        Gym gym2 = new Gym(21, "Titan Gym", "Bangalore", 300, 2200.0, "Karthik");
        gymList.add(4, gym2);

        System.out.println("Does list contain gym1:" + gymList.contains(gym1));
        System.out.println("Does list contain gymList2:" + gymList.containsAll(gymList2));
        System.out.println();

        gymList.remove(gym1);
        gymList.remove(7);

        System.out.println("Gym list after remove(Object) and remove(index):");
        for(Gym gym : gymList){
            System.out.println(gym);
        }
        System.out.println();

        gymList.removeAll(gymList2);
        System.out.println("Gym list after removing gymList2:");
        for(Gym gym : gymList){
            System.out.println(gym);
        }
        System.out.println();

        System.out.println("Does list contain gym1:" + gymList.contains(gym1));
        System.out.println("Does list contain gymList2:" + gymList.containsAll(gymList2));
        System.out.println();

        gymList.addAll(gymList2);
        gymList.retainAll(gymList2);

        System.out.println("Gym list after retaining only gymList2:");
        for(Gym gym : gymList){
            System.out.println(gym);
        }
        System.out.println();
    }
}
