package com.xworkz.therapistapp.impl;

import com.xworkz.therapistapp.therapist.Therapist;

public class PhysicalTherapistImpl implements Therapist {
    @Override
    public void diagnose() {
        System.out.println("Diagnose for physical injuries");
    }

    @Override
    public void provideTherapy() {
        System.out.println("Provide physical therapy");
    }

    @Override
    public void followUp() {
        System.out.println("Follow up to check improvements");
    }
}
