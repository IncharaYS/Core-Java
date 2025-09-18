package com.xworkz.therapistapp;

import com.xworkz.therapistapp.impl.PhysicalTherapistImpl;
import com.xworkz.therapistapp.therapist.Therapist;

public class TherapistRunner {
    public static void main(String[] args) {
        Therapist therapist=new PhysicalTherapistImpl();
        therapist.diagnose();
        therapist.provideTherapy();
        therapist.followUp();
    }
}
