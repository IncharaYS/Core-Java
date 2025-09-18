package com.xworkz.telescopeapp;

import com.xworkz.telescopeapp.impl.OpticalTelescopeImpl;
import com.xworkz.telescopeapp.telescope.Telescope;

public class TelescopeRunner {
    public static void main(String[] args) {
        Telescope telescope=new OpticalTelescopeImpl();
        telescope.focus();
        telescope.adjustLens();
        telescope.captureImage();
    }
}
