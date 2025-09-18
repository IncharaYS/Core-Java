package com.xworkz.votingapp;

import com.xworkz.votingapp.impl.PostalVotingImpl;
import com.xworkz.votingapp.votingsystem.VotingSystem;

public class VotingSystemRunner {
    public static void main(String[] args) {
        VotingSystem votingSystem=new PostalVotingImpl();
        votingSystem.registerVoter();
        votingSystem.castVote();
        votingSystem.countVotes();
    }
}
