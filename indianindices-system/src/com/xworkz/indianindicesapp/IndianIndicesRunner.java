package com.xworkz.indianindicesapp;

import com.xworkz.indianindicesapp.indianindices.IndianIndices;
import com.xworkz.indianindicesapp.nifty50.Nifty50;

public class IndianIndicesRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        IndianIndices indianIndices=new Nifty50();
        indianIndices.indianIndices();
        System.out.println("main ended");
    }
}
