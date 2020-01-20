package com.crts.app.sme.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LedgerUpdationDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerUpdationDetailsId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ledgerDetailsId")
	private String ledgerDetailsId;
	//need to get from mf_ledger_details table
	private String loanNo;
	private String emiPaidDate;
	private double emiPaidAmount;
	private int bucket;
	private double totalEmiPaid;
	
	
	public int getLedgerUpdationDetailsId() {
		return ledgerUpdationDetailsId;
	}
	public void setLedgerUpdationDetailsId(int ledgerUpdationDetailsId) {
		this.ledgerUpdationDetailsId = ledgerUpdationDetailsId;
	}
	public String getLedgerDetailsId() {
		return ledgerDetailsId;
	}
	public void setLedgerDetailsId(String ledgerDetailsId) {
		this.ledgerDetailsId = ledgerDetailsId;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public String getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	public double getEmiPaidAmount() {
		return emiPaidAmount;
	}
	public void setEmiPaidAmount(double emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}
	public int getBucket() {
		return bucket;
	}
	public void setBucket(int bucket) {
		this.bucket = bucket;
	}
	public double getTotalEmiPaid() {
		return totalEmiPaid;
	}
	public void setTotalEmiPaid(double totalEmiPaid) {
		this.totalEmiPaid = totalEmiPaid;
	}

}
