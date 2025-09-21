package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.constants.Category;
import com.xworkz.theatreapp.movie.Movie;

public interface TheatreRules {
    boolean addMovie(Movie movie);
    boolean updateProducerById(int existingId,String updatedProducer);
    boolean updateNameById(int existingId,String updatedName);
    boolean updatePriceById(int existingId,double updatedPrice);
    boolean updateCategoryById(int existingId, Category updatedCategory);
    boolean updateRatingById(int existingId,double updatedRating);
    String getNameById(int existingMovieId);
    String getProducerById(int existingMovieId);
    double getPriceById(int existingMovieId);
    Category getCategoryById(int existingMovieId);
    double getRatingById(int existingMovieId);
    Category getCategoryByName(String existingName);
    void deleteMovieByRating(double rating);
    void deleteMovieById(int id);
    Movie getMovieById(int existingId);
    void getMovieDetails(Movie movie);
    void getMovieInfo();
}
