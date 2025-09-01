package com.xworkz.showapp.podcast;

import com.xworkz.showapp.show.Show;

public class Podcast extends Show {
    @Override public void show(){
        System.out.println("Child method invoked");
    }
}
