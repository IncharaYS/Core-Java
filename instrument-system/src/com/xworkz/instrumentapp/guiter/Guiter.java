package com.xworkz.instrumentapp.guiter;

import com.xworkz.instrumentapp.instrument.Instrument;

public class Guiter extends Instrument {
    @Override public void instrument(){
        System.out.println("Child method invoked");
    }

}
