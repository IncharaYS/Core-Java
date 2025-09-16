package com.xworkz.theatreapp.validator;

import com.xworkz.theatreapp.movie.Movie;

public class MovieValidator {
    public boolean validateMovie(Movie movie){
        boolean isMovieValidated=false;
        boolean isMovieIdValid=false;
        boolean isNameValid=false;
        boolean isRatingValid=false;
        boolean isPriceValid=false;
        boolean isProducerValid=false;
        boolean isCategoryValid=false;

        if(movie.getMovieId()>0) isMovieIdValid=true;
        else System.out.println("Entered movie Id is not valid");

        if (movie.getCategory()!=null) isCategoryValid=true;
        else System.out.println("Entered category is not valid");

        if(movie.getName()!=null&&!movie.getName().isEmpty()) isNameValid=true;
        else System.out.println("Entered name is not valid");

       if(movie.getPrice()>0) isPriceValid=true;
       else System.out.println("Entered price is not valid");

       if(movie.getProducer()!=null&&!movie.getProducer().isEmpty()) isProducerValid=true;
       else System.out.println("Entered producer is not valid");

       if (movie.getRating()>0) isRatingValid=true;
       else System.out.println("Entered rating is not valid");

       if(isMovieIdValid&&isCategoryValid&&isPriceValid&&isNameValid&&isProducerValid&&isRatingValid){
           isMovieValidated=true;
       }
        return isMovieValidated;
    }
}
