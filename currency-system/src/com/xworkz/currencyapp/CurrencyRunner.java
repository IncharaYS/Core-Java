package com.xworkz.currencyapp;

import com.xworkz.currencyapp.currency.Currency;
import com.xworkz.currencyapp.impl.RupeesImpl;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency=new RupeesImpl();
        currency.deposit();
        currency.deposit();
        currency.exchange();
    }
}
