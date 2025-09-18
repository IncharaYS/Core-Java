package com.xworkz.paymentapp.paymentsyatem;

public interface PaymentSystem {
    void authenticate();
    void transferFunds();
    void generateReceipt();
}
