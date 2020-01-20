package com.crts.app.sme.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class LoanDisbursementDetails
{
	@Id
	private int loanDisbursmentId;
	
	
	private int loanMasterDetailsId;

	
	private int loanNo;
	
	//foreign key
	//@Column(name = "vd_id")
	//private String vehicleDetailsId;
	
	//private Double paidToDealer;
	
	private Double loanAmount;
	
	private int tenure;
	private Double emi;
	private int statusCode;
	public int getLoanDisbursmentId() {
		return loanDisbursmentId;
	}
	public void setLoanDisbursmentId(int loanDisbursmentId) {
		this.loanDisbursmentId = loanDisbursmentId;
	}
	public int getLoanMasterDetailsId() {
		return loanMasterDetailsId;
	}
	public void setLoanMasterDetailsId(int loanMasterDetailsId) {
		this.loanMasterDetailsId = loanMasterDetailsId;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
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
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}