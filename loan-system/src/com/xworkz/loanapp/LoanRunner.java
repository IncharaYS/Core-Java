package com.xworkz.loanapp;

import com.xworkz.loanapp.impl.CarLoanImpl;
import com.xworkz.loanapp.loan.Loan;

public class LoanRunner {
    public static void main(String[] args) {
        Loan loan=new CarLoanImpl();
        loan.applyLoan();
        loan.approveLoan();
        loan.interestAmount();
    }
}
