package com.xworkz.engineerapp;

import com.xworkz.engineerapp.engineer.Engineer;
import com.xworkz.engineerapp.impl.SoftwareDeveloperImpl;

public class EngineerRunner {
    public static void main(String[] args) {
        Engineer engineer=new SoftwareDeveloperImpl();
        engineer.design();
        engineer.test();
        engineer.build();
    }
}
