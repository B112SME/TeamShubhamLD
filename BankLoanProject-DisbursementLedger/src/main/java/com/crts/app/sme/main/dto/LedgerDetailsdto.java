package com.crts.app.sme.main.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LedgerDetailsdto {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerDetailsId;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="customerId")
	//private String customerId;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="loanId")
	private String loanNo;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="loanMasterDetailsId")
	//private String loanMasterDetailsId;

	private double totalAmount;
	//private int tenure;	
	private double emi; 	
	private double advanceEmi; 	
	private String emiStartDate;	
	private String emiEndDate;	
	//private String ledgerCreatedDate;	
	//private double ledgerDetailsEMIPaidAmount;
	
	public int getLedgerDetailsId() {
		return ledgerDetailsId;
	}
	public void setLedgerDetailsId(int ledgerDetailsId) {
		this.ledgerDetailsId = ledgerDetailsId;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public double getAdvanceEmi() {
		return advanceEmi;
	}
	public void setAdvanceEmi(double advanceEmi) {
		this.advanceEmi = advanceEmi;
	}
	public String getEmiStartDate() {
		return emiStartDate;
	}
	public void setEmiStartDate(String emiStartDate) {
		this.emiStartDate = emiStartDate;
	}
	public String getEmiEndDate() {
		return emiEndDate;
	}
	public void setEmiEndDate(String emiEndDate) {
		this.emiEndDate = emiEndDate;
	}
}
