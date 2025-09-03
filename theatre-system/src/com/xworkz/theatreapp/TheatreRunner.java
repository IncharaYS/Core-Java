package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        Movie movie1=new Movie();
        movie1.setMovieId(1);
        movie1.setCategory("Anime");
        movie1.setName("Demon slayer:Mugen train");
        movie1.setPrice(450.00);
        movie1.setProducer("Aniplex");
        movie1.setRating(8.2);

        Theatre theatre=new Theatre();
        theatre.addMovie(movie1);

        Movie movie2=new Movie(2,"Su from So","Raj",180.00,"Comedy",7.9);
        theatre.addMovie(movie2);

        Movie movie3 = new Movie(3, "Silent Shadows", "Anurag Kashyap", 140.00, "Thriller", 8.1);
        theatre.addMovie(movie3);

        Movie movie4 = new Movie(4, "Dancing Flames", "Sanjay Leela Bhansali", 200.00, "Drama", 7.5);
        theatre.addMovie(movie4);

        Movie movie5 = new Movie(5, "Future Bound", "James Cameron", 210.00, "Action", 8.7);
        theatre.addMovie(movie5);

        Movie movie6 = new Movie(6, "Love in Rain", "Karan Johar", 160.00, "Romance", 7.3);
        theatre.addMovie(movie6);

        Movie movie7 = new Movie(7, "The Lost Kingdom", "Peter Jackson", 220.00, "Fantasy", 8.4);
        theatre.addMovie(movie7);

        Movie movie8 = new Movie(8, "Chasing Dreams", "Zoya Akhtar", 155.00, "Drama", 7.8);
        theatre.addMovie(movie8);

        Movie movie9 = new Movie(9, "Code Breaker", "Rajkumar Hirani", 170.00, "Mystery", 8.0);
        theatre.addMovie(movie9);

        Movie movie10 = new Movie(10, "Edge of Fear", "Steven Spielberg", 190.00, "Thriller", 8.2);
        theatre.addMovie(movie10);

        theatre.getMovieInfo();

       /* if(theatre.addMovie(movie)) theatre.getMovieInfo();
        else System.out.println("Movie is not added");*/
    }
}
