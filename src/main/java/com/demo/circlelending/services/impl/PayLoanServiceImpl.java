package com.demo.circlelending.services.impl;

import java.util.List;

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
	public Loan findByLoanName(String loanName) 
	{
		return payLoanRepository.findByLoanName(loanName);
	}

	@Override
	public List<Loan> findByLoanAmountBetween(Double startingAmount, Double endAmount) 
	{
		
		return payLoanRepository.findByLoanAmountBetween(startingAmount, endAmount);
	}

	@Override
	public List<Loan> findByInterestRate(Float interestRate) 
	{
		
		List<Loan> loansByInterestRate = payLoanRepository.findByInterestRate(interestRate);
		return loansByInterestRate;
	}

}
