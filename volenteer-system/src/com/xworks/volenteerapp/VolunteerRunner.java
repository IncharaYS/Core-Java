package com.xworks.volenteerapp;

import com.xworks.volenteerapp.impl.DisasterVolunteer;
import com.xworks.volenteerapp.volunteer.Volunteer;

public class VolunteerRunner {
    public static void main(String[] args) {
        Volunteer volunteer=new DisasterVolunteer();
        volunteer.register();
        volunteer.help();
        volunteer.report();
    }
}
