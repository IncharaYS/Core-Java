package com.xworkz.gameapp.impl;

import com.xworkz.gameapp.game.Game;

public class HollowNightImpl implements Game {
    @Override
    public void start() {
        System.out.println("Starting hollow night game");
    }

    @Override
    public void play() {
        System.out.println("Playing hollow night game");
    }

    @Override
    public void end() {
        System.out.println("Ending hollow night game");
    }
}
