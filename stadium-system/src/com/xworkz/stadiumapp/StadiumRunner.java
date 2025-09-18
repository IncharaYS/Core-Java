package com.xworkz.stadiumapp;

import com.xworkz.stadiumapp.impl.CricketStadiumImpl;
import com.xworkz.stadiumapp.stadium.Stadium;

public class StadiumRunner {
    public static void main(String[] args) {
        Stadium stadium=new CricketStadiumImpl();
        stadium.hostMatch();
        stadium.maintainField();
        stadium.manageCrowd();
    }
}
