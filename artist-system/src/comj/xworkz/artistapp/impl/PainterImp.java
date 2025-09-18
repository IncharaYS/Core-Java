package comj.xworkz.artistapp.impl;

import comj.xworkz.artistapp.artist.Artist;

public class PainterImp implements Artist {
    @Override
    public void makeArt() {
        System.out.println("Make a painting");
    }

    @Override
    public void exhibit() {
        System.out.println("Exhibit the painting");
    }

    @Override
    public void sellArtwork() {
        System.out.println("Sell the painting");
    }
}
