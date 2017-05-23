package com.demo.circlelending.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
}
