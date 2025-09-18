package com.xworkz.cardapp.impl;

import com.xworkz.cardapp.card.Card;

public class SbiCardImpl implements Card {
    @Override
    public void swipe() {
        System.out.println("Swiping sbi card");
    }

    @Override
    public void tap() {
        System.out.println("Taping sbi card");
    }

    @Override
    public void validate() {
        System.out.println("Validating sbi card");
    }
}
