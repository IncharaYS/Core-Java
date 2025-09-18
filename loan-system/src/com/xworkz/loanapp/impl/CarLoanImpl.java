package com.xworkz.loanapp.impl;

import com.xworkz.loanapp.loan.Loan;

public class CarLoanImpl implements Loan {
    @Override
    public void applyLoan() {
        System.out.println("Applying for car loan");
    }

    @Override
    public void approveLoan() {
        System.out.println("Approving car loan");
    }

    @Override
    public void interestAmount() {
        System.out.println("Interest for car loan");
    }
}
