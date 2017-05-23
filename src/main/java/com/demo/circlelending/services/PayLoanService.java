package com.demo.circlelending.services;

import com.demo.circlelending.model.Loan;

public interface PayLoanService 
{
  public Loan saveLoanDetails(Loan loan);
  public Loan findByLoanName(Double loanName);
  public Loan findByLoanAmountBetween(Double startingAmount, Double endAmount);
  public Loan findByInterestRate(Float interestRate);
}
