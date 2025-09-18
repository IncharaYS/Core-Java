package com.xworkz.musemapp;

import com.xworkz.musemapp.impl.ArtMuseumImpl;
import com.xworkz.musemapp.museum.Museum;

public class MuseumRunner {
    public static void main(String[] args) {
        Museum museum=new ArtMuseumImpl();
        museum.openExhibit();
        museum.guideTour();
        museum.closeExhibit();

    }
}
