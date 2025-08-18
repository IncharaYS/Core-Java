package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        Movie movie=new Movie();
        movie.setMovieId(1);
        movie.setCategory("Anime");
        movie.setName("Demon slayer:Mugen train");
        movie.setPrice(450.00);
        movie.setProducer("Aniplex");
        movie.setRating(8.2);

        Theatre theatre=new Theatre();
        if(theatre.addMovie(movie)) theatre.getMovieInfo();
        else System.out.println("Movie is not added");
    }
}
