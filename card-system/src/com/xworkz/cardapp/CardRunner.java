package com.xworkz.cardapp;

import com.xworkz.cardapp.card.Card;
import com.xworkz.cardapp.impl.SbiCardImpl;

public class CardRunner {
    public static void main(String[] args) {
        Card card=new SbiCardImpl();
        card.tap();
        card.swipe();
        card.validate();
    }
}
