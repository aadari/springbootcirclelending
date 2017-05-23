package com.demo.circlelending.model;

import org.springframework.data.annotation.Id;

public class Loan 
{
	@Id
	private String loanId;
	private String loanName;
	private Double loanAmount;
	private Double amountLent;
	private Float interestRate;
	private Person personInfo;
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getAmountLent() {
		return amountLent;
	}
	public void setAmountLent(Double amountLent) {
		this.amountLent = amountLent;
	}
	public Float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}
	public Person getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(Person personInfo) {
		this.personInfo = personInfo;
	}
	
	
}
