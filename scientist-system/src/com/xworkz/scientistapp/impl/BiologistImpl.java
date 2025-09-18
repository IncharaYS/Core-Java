package com.xworkz.scientistapp.impl;

import com.xworkz.scientistapp.scientist.Scientist;

public class BiologistImpl implements Scientist {
    @Override
    public void research() {
        System.out.println("Researching in the field of biology");
    }

    @Override
    public void experiment() {
        System.out.println("Experimenting in the field of biology");
    }

    @Override
    public void publishPaper() {
        System.out.println("Publishing in the field of biology");
    }
}
