package com.xworkz.musemapp.impl;

import com.xworkz.musemapp.museum.Museum;

public class ArtMuseumImpl implements Museum {
    @Override
    public void openExhibit() {
        System.out.println("Opening art museum");
    }

    @Override
    public void guideTour() {
        System.out.println("Guiding though art museum");
    }

    @Override
    public void closeExhibit() {
        System.out.println("Closing art museum");
    }
}
