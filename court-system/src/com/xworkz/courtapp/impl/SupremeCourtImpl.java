package com.xworkz.courtapp.impl;

import com.xworkz.courtapp.court.Court;

public class SupremeCourtImpl implements Court {
    @Override
    public void startCase() {
        System.out.println("Start case in supreme court");
    }

    @Override
    public void hearArguments() {
        System.out.println("Hear arguments at supreme court");
    }

    @Override
    public void giveJudgment() {
        System.out.println("Give judgement in supreme court");
    }
}
