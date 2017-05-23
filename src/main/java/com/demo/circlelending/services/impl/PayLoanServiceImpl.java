package com.demo.circlelending.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.circlelending.model.Loan;
import com.demo.circlelending.repository.PayLoanRepository;
import com.demo.circlelending.services.PayLoanService;

@Service
public class PayLoanServiceImpl implements PayLoanService 
{
	@Autowired
	private PayLoanRepository payLoanRepository;

	
	@Override
	public Loan saveLoanDetails(Loan loan) 
	{
		return  payLoanRepository.save(loan);
	}

	@Override
	public Loan findByLoanName(Double loanName) 
	{
		return null;
	}

	@Override
	public Loan findByLoanAmountBetween(Double startingAmount, Double endAmount) 
	{
		
		return null;
	}

	@Override
	public Loan findByInterestRate(Float interestRate) 
	{
		
		return null;
	}

}
