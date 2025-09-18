package com.xworkz.trainerapp.impl;

import com.xworkz.trainerapp.trainer.Trainer;

public class FitnessTrainerImpl implements Trainer {
    @Override
    public void createPlan() {
        System.out.println("Creating a fitness plan");
    }

    @Override
    public void guide() {
        System.out.println("Guide through fitness plan");
    }

    @Override
    public void trackProgress() {
        System.out.println("Track progress in fitness plan");
    }
}
