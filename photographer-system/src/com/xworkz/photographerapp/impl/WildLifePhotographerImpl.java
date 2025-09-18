package com.xworkz.photographerapp.impl;

import com.xworkz.photographerapp.photographer.Photographer;

public class WildLifePhotographerImpl implements Photographer {
    @Override
    public void takePhoto() {
        System.out.println("Taking wildlife photo");
    }

    @Override
    public void editPhoto() {
        System.out.println("Editing wildlife photo");
    }

    @Override
    public void deliverPhoto() {
        System.out.println("Delivering wildlife photo");
    }
}
