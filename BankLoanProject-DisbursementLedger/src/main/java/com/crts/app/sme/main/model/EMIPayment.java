package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EMIPayment 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emiPaymentId;
	private String loanNo;
	private Double emiAmount;
	private String emiDueDate;
	private Double emiPaidAmount;
	private Double remainingAmount;
	private String emiPaidDate;
	private int statusCode;
	
	public int getEmiPaymentId() {
		return emiPaymentId;
	}
	public void setEmiPaymentId(int emiPaymentId) {
		this.emiPaymentId = emiPaymentId;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public Double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getEmiDueDate() {
		return emiDueDate;
	}
	public void setEmiDueDate(String emiDueDate) {
		this.emiDueDate = emiDueDate;
	}
	public Double getEmiPaidAmount() {
		return emiPaidAmount;
	}
	public void setEmiPaidAmount(Double emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}
	public Double getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(Double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
	public String getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	
}
