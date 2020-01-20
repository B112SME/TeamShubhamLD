package com.crts.app.sme.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanDisbursementId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loanMasterDetailsId")
	private int loanMasterDetailsId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loanId")
	private int loanNo;
	
	//foreign key
	//@Column(name = "vd_id")
	//private String vehicleDetailsId;
	
	//private Double paidToDealer;
	
	private double loanAmount;
	
	private int tenure;
	private double emi;
	private int statusCode;
	public int getLoanDisbursementId() {
		return loanDisbursementId;
	}
	public void setLoanDisbursementId(int loanDisbursementId) {
		this.loanDisbursementId = loanDisbursementId;
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
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
  }