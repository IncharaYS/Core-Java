package com.xworkz.telescopeapp.impl;

import com.xworkz.telescopeapp.telescope.Telescope;

public class OpticalTelescopeImpl implements Telescope {
    @Override
    public void focus() {
        System.out.println("Focussing object using optical telescope");
    }

    @Override
    public void captureImage() {
        System.out.println("Capturing image using optical telescope");
    }

    @Override
    public void adjustLens() {
        System.out.println("Adjusting lens of optical telescope");
    }
}
