package com.xworkz.resortapp;

import com.xworkz.resortapp.impl.BeachResortImpl;
import com.xworkz.resortapp.resort.Resort;

public class ResortRunner {
    public static void main(String[] args) {
        Resort resort=new BeachResortImpl();
        resort.organizeActivities();
        resort.provideStay();
        resort.serveMeals();
    }
}
