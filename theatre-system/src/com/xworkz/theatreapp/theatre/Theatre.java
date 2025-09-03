package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validator.MovieValidator;

public class Theatre {
    Movie[] movies=new Movie[10];
    int index;

    public boolean addMovie(Movie movie){
        boolean isMovieAdded=false;
        MovieValidator movieValidator=new MovieValidator();
        if(movieValidator.validateMovie(movie)){
            movies[index++]=movie;
            isMovieAdded=true;
        }

        return isMovieAdded;
    }
    public void getMovieInfo() {
        for (Movie movie : movies) {
            System.out.println("Movie ID is: " +movie.getMovieId());
            System.out.println("Movie name is: " +movie.getName());
            System.out.println("Movie category is: " +movie.getCategory());
            System.out.println("Movie price is: " +movie.getPrice());
            System.out.println("Movie rating is: " +movie.getRating());
            System.out.println("Movie producer is: " +movie.getProducer()+"\n");
        }
    }
}
