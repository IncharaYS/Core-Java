package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validator.MovieValidator;

public class Theatre {
    Movie movie;
    public boolean addMovie(Movie movie){
        boolean isMovieAdded=false;
        MovieValidator movieValidator=new MovieValidator();
        if(movieValidator.validateMovie(movie)){
            this.movie=movie;
            isMovieAdded=true;
        }

        return isMovieAdded;
    }
    public void getMovieInfo(){
        System.out.println("Movie ID is: "+this.movie.getMovieId());
        System.out.println("Movie name is: "+this.movie.getName());
        System.out.println("Movie category is: "+this.movie.getCategory());
        System.out.println("Movie price is: "+this.movie.getPrice());
        System.out.println("Movie rating is: "+this.movie.getRating());
        System.out.println("Movie producer is: "+this.movie.getProducer());
    }
}
