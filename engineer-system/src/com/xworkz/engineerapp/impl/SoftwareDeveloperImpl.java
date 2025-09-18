package com.xworkz.engineerapp.impl;

import com.xworkz.engineerapp.engineer.Engineer;

public class SoftwareDeveloperImpl implements Engineer {
    @Override
    public void design() {
        System.out.println("Designing a webpage");
    }

    @Override
    public void build() {
        System.out.println("Building a web application");
    }

    @Override
    public void test() {
        System.out.println("Testing the website");
    }
}
