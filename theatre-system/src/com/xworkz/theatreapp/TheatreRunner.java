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

       /* Movie movie1=new Movie();
        movie1.setMovieId(1);
        movie1.setCategory("Anime");
        movie1.setName("Demon slayer:Mugen train");
        movie1.setPrice(450.00);
        movie1.setProducer("Aniplex");
        movie1.setRating(8.2);

        TheatreImpl theatre=new TheatreImpl();
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
