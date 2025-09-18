package com.xworkz.podcastapp.impl;

import com.xworkz.podcastapp.podcaast.PodCast;

public class TravelPodcastImpl implements PodCast {
    @Override
    public void recordEpisode() {
        System.out.println("Recoding for travel podcast");
    }

    @Override
    public void editEpisode() {
        System.out.println("Editing travel podcast");
    }

    @Override
    public void publishEpisode() {
        System.out.println("Publishing travel podcast");
    }
}
