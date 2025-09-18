package com.xworkz.paymentapp.impl;

import com.xworkz.paymentapp.paymentsyatem.PaymentSystem;

import java.lang.reflect.ParameterizedType;

public class PhonePayImpl implements PaymentSystem {
    @Override
    public void authenticate() {
        System.out.println("Authenticate phone pay user");
    }

    @Override
    public void transferFunds() {
        System.out.println("Transfer money using phone pay");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Generate phonepay receipt");
    }
}
