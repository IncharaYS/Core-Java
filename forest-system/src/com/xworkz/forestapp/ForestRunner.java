package com.xworkz.forestapp;

import com.xworkz.forestapp.forest.Forest;

public class ForestRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Forest forest1=new Forest();
        forest1.setForestId(1);
        forest1.setState("Karnataka");
        forest1.setArea("Mysore");
        forest1.setName("Bandipur");
        forest1.setProtected(true);

        System.out.println("Forest Id is: "+forest1.getForestId());
        System.out.println("Forest state is: "+forest1.getState());
        System.out.println("Forest area is: "+forest1.getArea());
        System.out.println("Forest name is: "+forest1.getName());
        System.out.println("Forest is protected?: "+forest1.getIsProtected());

        System.out.println("main ended");
    }
}
