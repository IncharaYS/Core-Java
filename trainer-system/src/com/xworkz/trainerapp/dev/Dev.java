package com.xworkz.trainerapp.dev;

import com.xworkz.trainerapp.trainer.Trainer;

public class Dev extends Trainer {
    @Override public void trainer(){
        System.out.println("Child method invoked");
    }
}
