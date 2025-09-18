package com.xworkz.currencyapp.impl;

import com.xworkz.currencyapp.currency.Currency;

public class RupeesImpl implements Currency {
    @Override
    public void deposit() {
        System.out.println("Deposit currency in rupees");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw currency in rupees");
    }

    @Override
    public void exchange() {
        System.out.println("Exchange currency from rupees");
    }
}
