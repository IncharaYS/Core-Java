package com.xworkz.gameapp;

import com.xworkz.gameapp.game.Game;
import com.xworkz.gameapp.impl.HollowNightImpl;

public class GameRunner {
    public static void main(String[] args) {
        Game game=new HollowNightImpl();
        game.start();
        game.play();
        game.end();
    }
}
