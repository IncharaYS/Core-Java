package com.xworks.volenteerapp.impl;

import com.xworks.volenteerapp.volunteer.Volunteer;

public class DisasterVolunteer implements Volunteer {
    @Override
    public void register() {
        System.out.println("Register as disaster volunteer");
    }

    @Override
    public void help() {
        System.out.println("Help as disaster volunteer");
    }

    @Override
    public void report() {
        System.out.println("Report as disaster volunteer");
    }
}
