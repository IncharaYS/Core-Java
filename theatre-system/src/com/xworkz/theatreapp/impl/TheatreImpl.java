package com.xworkz.theatreapp.impl;

import com.xworkz.theatreapp.constants.Category;
import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.TheatreRules;
import com.xworkz.theatreapp.validator.MovieValidator;

public class TheatreImpl implements TheatreRules {

    public TheatreImpl(int size){
        this.movies=new Movie[size];
    }

    public Movie[] movies;
    public int index;

    @Override
    public boolean addMovie(Movie movie){
        boolean isMovieAdded=false;
        MovieValidator movieValidator=new MovieValidator();
        if(movieValidator.validateMovie(movie)){
            movies[index++]=movie;
            isMovieAdded=true;
        }

        return isMovieAdded;
    }

    @Override
    public boolean updateProducerById(int existingId,String updatedProducer){
        boolean isProducerUpdated=false;
        for(Movie movie:this.movies){
            if(movie.getMovieId()==existingId){
                movie.setProducer(updatedProducer);
                isProducerUpdated=true;
                System.out.println("Producer of movie "+movie.getMovieId()+" updated to:"+movie.getProducer());
            }
            if(!isProducerUpdated) System.out.println("Movie Id "+existingId+" does not exist");
        }

        return isProducerUpdated;
    }

    @Override
    public boolean updateNameById(int existingId,String updatedName){
        boolean isNameUpdated=false;
        for(Movie movie:this.movies){
            if(movie.getMovieId()==existingId){
                movie.setName(updatedName);
                isNameUpdated=true;
                System.out.println("Name of movie "+movie.getMovieId()+" updated to:"+movie.getName());
            }
            if(!isNameUpdated) System.out.println("Movie Id "+existingId+" does not exist");
        }

        return isNameUpdated;
    }

    @Override
    public boolean updatePriceById(int existingId,double updatedPrice){
        boolean isPriceUpdated=false;
        for(Movie movie:this.movies){
            if(movie.getMovieId()==existingId){
                movie.setPrice(updatedPrice);
                isPriceUpdated=true;
                System.out.println("Price of movie "+movie.getMovieId()+" updated to:"+movie.getPrice());
            }
            if(!isPriceUpdated) System.out.println("Movie Id "+existingId+" does not exist");
        }

        return isPriceUpdated;
    }

    @Override
    public boolean updateCategoryById(int existingId,Category updatedCategory){
        boolean isCategoryUpdated=false;
        for(Movie movie:this.movies){
            if(movie.getMovieId()==existingId){
                movie.setCategory(updatedCategory);
                isCategoryUpdated=true;
                System.out.println("Category of movie "+movie.getMovieId()+" updated to:"+movie.getCategory());
            }
            if(!isCategoryUpdated) System.out.println("Movie Id "+existingId+" does not exist");
        }

        return isCategoryUpdated;
    }

    @Override
    public boolean updateRatingById(int existingId,double updatedRating){
        boolean isRatingUpdated=false;
        for(Movie movie:this.movies){
            if(movie.getMovieId()==existingId){
                movie.setRating(updatedRating);
                isRatingUpdated=true;
                System.out.println("Rating of movie "+movie.getMovieId()+" updated to:"+movie.getRating());
            }
            if(!isRatingUpdated) System.out.println("Movie Id "+existingId+" does not exist");
        }

        return isRatingUpdated;
    }

    @Override
    public String getNameById(int existingMovieId){
        boolean isIdFound=false;
        for(Movie movie:movies){
            if(movie.getMovieId()==existingMovieId){
                isIdFound=true;
                return movie.getName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public String getProducerById(int existingMovieId){
        boolean isIdFound=false;
        for(Movie movie:movies){
            if(movie!=null&&movie.getMovieId()==existingMovieId){
                isIdFound=true;
                return movie.getProducer();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public double getPriceById(int existingMovieId){
        boolean isIdFound=false;
        for(Movie movie:movies){
            if(movie!=null&&movie.getMovieId()==existingMovieId){
                isIdFound=true;
                return movie.getPrice();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    @Override
    public Category getCategoryById(int existingMovieId){
        boolean isIdFound=false;
        for(Movie movie:movies){
            if(movie!=null&&movie.getMovieId()==existingMovieId){
                isIdFound=true;
                return movie.getCategory();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public double getRatingById(int existingMovieId){
        boolean isIdFound=false;
        for(Movie movie:movies){
            if(movie!=null&&movie.getMovieId()==existingMovieId){
                isIdFound=true;
                return movie.getRating();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    @Override
    public Category getCategoryByName(String existingName){
        boolean isIdFound=false;
        for(Movie movie:movies){
            if(movie!=null&&movie.getName().equals(existingName)){
                isIdFound=true;
                return movie.getCategory();
            }
        }
        System.out.println("Name not found");
        return null;
    }


    @Override
    public void deleteMovieByRating(double rating){
        boolean isDeleted=false;
        for(int i=0;i<movies.length;i++){
            if(movies[i].getRating()==rating&&movies[i]!=null){
                for (int j=i;j<movies.length-1;j++) {
                    movies[j]=movies[j+1];
                }
                movies[movies.length - 1] = null;
                System.out.println("Movie with rating "+rating+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No movie with rating "+rating+" is found");
    }

    @Override
    public void deleteMovieById(int id){
        boolean isDeleted=false;
        for(int i=0;i<movies.length;i++){
            if(movies[i].getMovieId()==id&&movies[i]!=null){
                for (int j=i;j<movies.length-1;j++) {
                    movies[j]=movies[j+1];
                }
                movies[movies.length - 1] = null;
                System.out.println("Movie with id "+id+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No movie with id "+id+" is found");
    }

    @Override
    public Movie getMovieById(int existingId){
        Movie moviec=null;
        for(Movie movie:movies){
            if(movie.getMovieId()==existingId){
                moviec=movie;
                System.out.println("Movie details are:");
                getMovieDetails(movie);
            }
        }
        return moviec;
    }

    @Override
    public void getMovieDetails(Movie movie){
        if (movie != null) {
            System.out.println("Movie ID is: " + movie.getMovieId());
            System.out.println("Movie name is: " + movie.getName());
            System.out.println("Movie category is: " + movie.getCategory());
            System.out.println("Movie price is: " + movie.getPrice());
            System.out.println("Movie rating is: " + movie.getRating());
            System.out.println("Movie producer is: " + movie.getProducer() );
            System.out.println("-------------------------------------------------------");
        }
        else{
            System.out.println("No movie found");
            System.out.println("-------------------------------------------------------");
        }
    }

    @Override
    public void getMovieInfo() {
        System.out.println("Movie details are:");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println("Movie ID is: " + movie.getMovieId());
                System.out.println("Movie name is: " + movie.getName());
                System.out.println("Movie category is: " + movie.getCategory());
                System.out.println("Movie price is: " + movie.getPrice());
                System.out.println("Movie rating is: " + movie.getRating());
                System.out.println("Movie producer is: " + movie.getProducer() );
                System.out.println("-------------------------------------------------------");
            }
            else{
                System.out.println("No movie found");
                System.out.println("-------------------------------------------------------");
            }
        }
    }
}
