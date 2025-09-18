package com.xworkz.lawyerapp.impl;

import com.xworkz.lawyerapp.lawyer.Lawyer;

public class DefenceLawyerImpl implements Lawyer {
    @Override
    public void consultClient() {
        System.out.println("Defence lawyer consults client");
    }

    @Override
    public void representCase() {
        System.out.println("Defence lawyer represents case");
    }

    @Override
    public void draftDocument() {
        System.out.println("Defence lawyer draft documents");
    }
}
