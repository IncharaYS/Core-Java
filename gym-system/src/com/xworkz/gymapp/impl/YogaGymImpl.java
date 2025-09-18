package com.xworkz.gymapp.impl;

import com.xworkz.gymapp.gym.Gym;

public class YogaGymImpl implements Gym {
    @Override
    public void admitMember() {
        System.out.println("Add members for yoga gym");
    }

    @Override
    public void conductTraining() {
        System.out.println("Conduct training at yoga gym");
    }

    @Override
    public void checkEquipment() {
        System.out.println("Check equipment yoga gym");
    }
}
