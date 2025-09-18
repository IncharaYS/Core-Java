package com.xworkz.researchlabapp;

import com.xworkz.researchlabapp.impl.PhysicsLabImpl;
import com.xworkz.researchlabapp.researchlab.ResearchLab;

public class ResearchLabRunner {
    public static void main(String[] args) {
        ResearchLab researchLab=new PhysicsLabImpl();
        researchLab.analyzeData();
        researchLab.conductExperiment();
        researchLab.publishFindings();
    }
}
