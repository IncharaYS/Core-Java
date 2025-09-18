package com.xworkz.gymapp;

import com.xworkz.gymapp.gym.Gym;
import com.xworkz.gymapp.impl.YogaGymImpl;

public class GymRunner {
    public static void main(String[] args) {
        Gym gym=new YogaGymImpl();
        gym.admitMember();
        gym.checkEquipment();
        gym.conductTraining();
    }
}
