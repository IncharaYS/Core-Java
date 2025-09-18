package com.xworkz.tournamentapp.impl;

import com.xworkz.tournamentapp.tournament.Tournament;

public class ChessTournamentImpl implements Tournament {
    @Override
    public void registerTeams() {
        System.out.println("Register teams for chess tournament");
    }

    @Override
    public void scheduleMatches() {
        System.out.println("Schedule matches in chess tournament");
    }

    @Override
    public void announceWinner() {
        System.out.println("Announce winner of chess tournament");
    }
}
