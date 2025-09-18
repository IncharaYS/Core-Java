package com.xworkz.podcastapp;

import com.xworkz.podcastapp.impl.TravelPodcastImpl;
import com.xworkz.podcastapp.podcaast.PodCast;

public class PodCastRunner {
    public static void main(String[] args) {
        PodCast podCast=new TravelPodcastImpl();
        podCast.editEpisode();;
        podCast.recordEpisode();
        podCast.publishEpisode();
    }
}
