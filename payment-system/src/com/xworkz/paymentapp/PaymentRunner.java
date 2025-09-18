package com.xworkz.paymentapp;

import com.xworkz.paymentapp.impl.PhonePayImpl;
import com.xworkz.paymentapp.paymentsyatem.PaymentSystem;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentSystem paymentSystem=new PhonePayImpl();
        paymentSystem.authenticate();
        paymentSystem.transferFunds();
        paymentSystem.generateReceipt();

    }
}
