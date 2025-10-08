package com.xworkz.theatreapp;

import com.xworkz.theatreapp.constants.Category;
import com.xworkz.theatreapp.impl.TheatreImpl;
import com.xworkz.theatreapp.movie.Movie;

import java.util.Scanner;

public class TheatreRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of movies to be added:");
        int size=sc.nextInt();
        TheatreImpl theatre=new TheatreImpl(size);
        System.out.println("Number of movie's details to be added is:"+theatre.movies.length);


        for(int i=0;i<size;i++){
            Movie movie=new Movie();
            System.out.println("Enter the details of movie "+(i+1));
            System.out.print("Enter the movie id:");
            movie.setMovieId(sc.nextInt());sc.nextLine();
            System.out.print("Enter the movie name:");
            movie.setName(sc.nextLine());
            System.out.print("Enter the movie producer:");
            movie.setProducer(sc.nextLine());
            System.out.print("Enter the movie price:");
            movie.setPrice(sc.nextDouble());sc.nextLine();
            System.out.print("Enter the movie category:");
            movie.setCategory(Category.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter the movie rating:");
            movie.setRating(sc.nextDouble());
            theatre.addMovie(movie);
            System.out.println("-------------------------------------------------------");
        }

        theatre.getMovieInfo();

        System.out.print("Enter Id of movie to update name:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=theatre.updateNameById(id,sc.nextLine());
        if(isUpdated) System.out.println("Name updated successfully \n");
        else System.out.println("Failed to update name\n");

//        theatre.updateCategoryById(1,Category.ACTION);
//        theatre.updatePriceById(1,8999);
//        theatre.updateProducerById(1,"Ram");
//        theatre.updateRatingById(2,8.9);

        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+theatre.getNameById(sc.nextInt()));

//        theatre.getCategoryById(2);
//        theatre.getCategoryByName("KGF");
//        theatre.getPriceById(2);
//        theatre.getProducerById(2);
//        theatre.getRatingById(2);
//        theatre.deleteMovieByRating(3.6);


        System.out.println("Enter id to get movie details");
        theatre.getMovieById(sc.nextInt());

        System.out.print("Enter movie id to delete it:");
        theatre.deleteMovieById(sc.nextInt());
        theatre.getMovieInfo();

    }
}
