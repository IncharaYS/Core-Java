package com.xworkz.scientistapp;

import com.xworkz.scientistapp.impl.BiologistImpl;
import com.xworkz.scientistapp.scientist.Scientist;

public class ScientistRunner {
    public static void main(String[] args) {
        Scientist scientist=new BiologistImpl();
        scientist.research();
        scientist.experiment();
        scientist.publishPaper();
    }
}
