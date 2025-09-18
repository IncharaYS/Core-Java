package com.xworkz.lawyerapp;

import com.xworkz.lawyerapp.impl.DefenceLawyerImpl;
import com.xworkz.lawyerapp.lawyer.Lawyer;

public class LawyerRunner {
    public static void main(String[] args) {
        Lawyer lawyer=new DefenceLawyerImpl();
        lawyer.consultClient();
        lawyer.representCase();
        lawyer.draftDocument();
    }
}
