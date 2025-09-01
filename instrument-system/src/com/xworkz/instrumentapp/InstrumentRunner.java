package com.xworkz.instrumentapp;

import com.xworkz.instrumentapp.guiter.Guiter;
import com.xworkz.instrumentapp.instrument.Instrument;

public class InstrumentRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Instrument instrument=new Guiter();
        instrument.instrument();
        System.out.println("main ended");
    }
}
