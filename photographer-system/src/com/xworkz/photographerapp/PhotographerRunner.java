package com.xworkz.photographerapp;

import com.xworkz.photographerapp.impl.WildLifePhotographerImpl;
import com.xworkz.photographerapp.photographer.Photographer;

public class PhotographerRunner {
    public static void main(String[] args) {
        Photographer photographer=new WildLifePhotographerImpl();
        photographer.takePhoto();
        photographer.editPhoto();
        photographer.deliverPhoto();
    }
}
