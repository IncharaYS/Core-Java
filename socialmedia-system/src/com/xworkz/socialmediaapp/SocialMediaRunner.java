package com.xworkz.socialmediaapp;

import com.xworkz.socialmediaapp.impl.InstagramImpl;
import com.xworkz.socialmediaapp.socialmedia.SocialMedia;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMedia socialMedia=new InstagramImpl();
        socialMedia.comment();
        socialMedia.like();
        socialMedia.post();
        socialMedia.share();
    }
}
