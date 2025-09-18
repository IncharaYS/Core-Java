package com.xworkz.musicianapp.pianist;

import com.xworkz.musicianapp.musician.Musician;

public class PianistImpl implements Musician {
    @Override
    public void playInstrument() {
        System.out.println("Play piano");
    }

    @Override
    public void compose() {
        System.out.println("Compose music using piano");
    }

    @Override
    public void perform() {
        System.out.println("Perform the music");
    }
}
