package com.xworkz.stationyapp;

import com.xworkz.stationyapp.srihari.SriHari;
import com.xworkz.stationyapp.stationary.Stationary;

public class StationaryRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Stationary stationary=new SriHari();
        stationary.stationary();
        System.out.println("main ended");
    }
}
