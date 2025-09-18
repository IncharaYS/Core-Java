package com.xworkz.trainerapp;

import com.xworkz.trainerapp.impl.FitnessTrainerImpl;
import com.xworkz.trainerapp.trainer.Trainer;

public class TrainerRunner {
    public static void main(String[] args) {
        Trainer trainer=new FitnessTrainerImpl();
        trainer.createPlan();
        trainer.guide();
        trainer.trackProgress();
    }
}
