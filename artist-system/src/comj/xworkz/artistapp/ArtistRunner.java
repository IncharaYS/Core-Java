package comj.xworkz.artistapp;

import comj.xworkz.artistapp.artist.Artist;
import comj.xworkz.artistapp.impl.PainterImp;

public class ArtistRunner {
    public static void main(String[] args) {
        Artist artist=new PainterImp();
        artist.makeArt();
        artist.exhibit();
        artist.sellArtwork();
    }
}
