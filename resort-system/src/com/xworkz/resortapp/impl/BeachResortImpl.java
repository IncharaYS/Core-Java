package com.xworkz.resortapp.impl;

import com.xworkz.resortapp.resort.Resort;

public class BeachResortImpl implements Resort {
    @Override
    public void provideStay() {
        System.out.println("Provide stay at beach resort");
    }

    @Override
    public void organizeActivities() {
        System.out.println("Organize activities at beach resort");
    }

    @Override
    public void serveMeals() {
        System.out.println("Serve meals at beach resort");
    }
}
