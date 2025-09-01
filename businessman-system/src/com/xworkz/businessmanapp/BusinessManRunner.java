package com.xworkz.businessmanapp;

import com.xworkz.businessmanapp.businessman.BusinessMan;
import com.xworkz.businessmanapp.ratantata.RatanTata;

public class BusinessManRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        BusinessMan businessMan=new RatanTata();
        businessMan.businessMan();
        System.out.println("main ended");

    }
}
