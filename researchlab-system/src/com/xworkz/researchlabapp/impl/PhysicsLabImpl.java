package com.xworkz.researchlabapp.impl;

import com.xworkz.researchlabapp.researchlab.ResearchLab;

public class PhysicsLabImpl implements ResearchLab {
    @Override
    public void conductExperiment() {
        System.out.println("Conduct experiment at physics lab");
    }

    @Override
    public void analyzeData() {
        System.out.println("Analyze at physics lab");
    }

    @Override
    public void publishFindings() {
        System.out.println("Publish findings from physics lab");
    }
}
