package com.xworkz.tournamentapp;

import com.xworkz.tournamentapp.impl.ChessTournamentImpl;
import com.xworkz.tournamentapp.tournament.Tournament;

public class TournamentRunner {
    public static void main(String[] args) {
        Tournament tournament=new ChessTournamentImpl();
        tournament.scheduleMatches();
        tournament.registerTeams();
        tournament.announceWinner();
    }
}
