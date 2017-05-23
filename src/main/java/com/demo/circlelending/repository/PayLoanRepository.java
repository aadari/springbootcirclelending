package com.demo.circlelending.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.circlelending.model.Loan;

@Repository
public interface PayLoanRepository extends MongoRepository<Loan, String>
{
	  public Loan saveLoanDetails(Loan loan);
	  public Loan findByLoanName(String loanName);
	  public List<Loan> findByLoanAmountBetween(Double startingAmount, Double endAmount);
	  public List<Loan> findByInterestRate(Float interestRate);
}
