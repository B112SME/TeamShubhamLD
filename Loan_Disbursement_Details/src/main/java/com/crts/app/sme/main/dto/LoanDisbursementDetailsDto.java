package com.crts.app.sme.main.dto;

public class LoanDisbursementDetailsDto 
{
private Double loanAmount;
	
	private int tenure;

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
}