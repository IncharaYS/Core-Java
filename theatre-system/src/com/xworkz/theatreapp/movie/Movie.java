package com.xworkz.theatreapp.movie;

public class Movie {
    private int movieId;
    private String name;
    private String producer;
    private double price;
    private String category;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public double getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public String getProducer() {
        return producer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
