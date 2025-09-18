package com.xworkz.stadiumapp.impl;

import com.xworkz.stadiumapp.stadium.Stadium;

public class CricketStadiumImpl implements Stadium {
    @Override
    public void hostMatch() {
        System.out.println("Host a cricket match");
    }

    @Override
    public void manageCrowd() {
        System.out.println("manage crowd at cricket match");
    }

    @Override
    public void maintainField() {
        System.out.println("Maintain cricket field");
    }
}
