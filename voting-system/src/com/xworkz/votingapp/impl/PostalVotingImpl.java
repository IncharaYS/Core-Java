package com.xworkz.votingapp.impl;

import com.xworkz.votingapp.votingsystem.VotingSystem;

public class PostalVotingImpl implements VotingSystem {
    @Override
    public void registerVoter() {
        System.out.println("Registering voter for postal voting");
    }

    @Override
    public void castVote() {
        System.out.println("Casting vote using postal voting");
    }

    @Override
    public void countVotes() {
        System.out.println("Counting vote for postal voting");
    }
}
