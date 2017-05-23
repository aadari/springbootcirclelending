package com.demo.circlelending.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.circlelending.model.Loan;
import com.demo.circlelending.services.PayLoanService;

@RestController("/")
public class CircleLendingController
{
 @Autowired
 PayLoanService payLoanService;
	
 @RequestMapping(value = "payloan",method = RequestMethod.POST , produces = "application/json")
 public Loan saveLoanDetails(@RequestBody Loan loan)
 {
	return payLoanService.saveLoanDetails(loan);
	 
 }
 
 @RequestMapping(value = "payloan/{loanName}",method = RequestMethod.GET , produces = "application/json")
 public Loan findByLoanName(@PathVariable(value="loanName") String loanName)
 {
	return payLoanService.findByLoanName(loanName);
	 
 }
 
 @RequestMapping(value = "payloan/amountRange/{startingAmount}/{endingAmount}",method = RequestMethod.GET , produces = "application/json")
 public List<Loan> findByLoanAmountBetween(@PathVariable(value="startingAmount") Double startingAmount
		                                     , @PathVariable(value="endingAmount") Double endingAmount)
 {
	return payLoanService.findByLoanAmountBetween(startingAmount, endingAmount);
	 
 }
 
 @RequestMapping(value = "payloan/interestRate/{interestRate}",method = RequestMethod.GET , produces = "application/json")
 public List<Loan> findByInterestRate(@PathVariable(value="interestRate") Float interestRate)
 {
	return payLoanService.findByInterestRate(interestRate);
	 
 }
 
}
