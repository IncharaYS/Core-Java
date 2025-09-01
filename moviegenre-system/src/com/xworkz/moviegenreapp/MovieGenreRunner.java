package com.xworkz.moviegenreapp;

import com.xworkz.moviegenreapp.comedy.Comedy;
import com.xworkz.moviegenreapp.moviegenre.MovieGenre;

public class MovieGenreRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        MovieGenre movieGenre=new Comedy();
        movieGenre.movieGenre();
        System.out.println("main ended");
    }
}
