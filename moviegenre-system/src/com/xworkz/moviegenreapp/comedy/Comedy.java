package com.xworkz.moviegenreapp.comedy;

import com.xworkz.moviegenreapp.moviegenre.MovieGenre;

public class Comedy extends MovieGenre {
    @Override public void movieGenre(){
        System.out.println("Child method invoked");
    }
}
