package com.xworkz.actorapp;

import com.xworkz.actorapp.actor.Actor;
import com.xworkz.actorapp.vishnuvardhan.VishnuVardhan;

public class ActorRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Actor actor=new VishnuVardhan();
        actor.actor();
        System.out.println("main ended");
    }
}
