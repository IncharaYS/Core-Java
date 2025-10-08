package com.xworkz.theatreapp.movie;

import com.xworkz.theatreapp.constants.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private int movieId;
    private String name;
    private String producer;
    private double price;
    private Category category;
    private double rating;

    @Override
    public String toString(){
        return "Movie-(movieId="+this.movieId+
                " , name="+this.name+
                " , producer="+this.producer+
                " , price="+this.price+
                " , category="+this.category+
                " , rating="+this.rating+
                ")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Movie){
            Movie movie=(Movie) obj;
            if(this.movieId==movie.movieId&&this.name.equals(movie.name)&&this.producer.equals(movie.producer)
            &&this.price==movie.price&&this.category.equals(movie.category)&&this.rating==movie.rating){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(movieId,name,producer,price,category,rating);
    }
}
