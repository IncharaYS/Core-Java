package com.xworkz.musicianapp;

import com.xworkz.musicianapp.musician.Musician;
import com.xworkz.musicianapp.pianist.PianistImpl;

public class MusicianRunner {
    public static void main(String[] args) {
        Musician musician=new PianistImpl();
        musician.playInstrument();
        musician.compose();
        musician.perform();
    }
}
