package com.demo.circlelending.services;

import java.util.List;

import com.demo.circlelending.model.Loan;

public interface PayLoanService 
{
  public Loan saveLoanDetails(Loan loan);
  public Loan findByLoanName(String loanName);
  public List<Loan> findByLoanAmountBetween(Double startingAmount, Double endAmount);
  public List<Loan> findByInterestRate(Float interestRate);
}
