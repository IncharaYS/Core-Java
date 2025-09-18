package com.xworkz.socialmediaapp.impl;

import com.xworkz.socialmediaapp.socialmedia.SocialMedia;

public class InstagramImpl implements SocialMedia {
    @Override
    public void post() {
        System.out.println("Posting on social media");
    }

    @Override
    public void like() {
        System.out.println("Liking post");
    }

    @Override
    public void comment() {
        System.out.println("Commenting on post");
    }

    @Override
    public void share() {
        System.out.println("Sharing post");
    }
}
