package com.crts.app.sme.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoanDisbursementMaster 
  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanDisbursementMasterId;
	
	//@OneToOne(cascade = CascadeType.ALL)
	private String loanNo;
	private String amountPayType;
	private double totalAmount;
	private String bankName;
	private long accountNumber;
	private String ifscCode;
	private String accountType;
	private double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;
	@Override
	public String toString() {
		return "LoanDisbursementMaster [loanDisbursementMasterId=" + loanDisbursementMasterId + ", loanNo=" + loanNo
				+ ", amountPayType=" + amountPayType + ", totalAmount=" + totalAmount + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", accountType=" + accountType
				+ ", transferAmount=" + transferAmount + ", paymentStatus=" + paymentStatus + ", amountPaidDate="
				+ amountPaidDate + "]";
	}
	public int getLoanDisbursementMasterId() {
		return loanDisbursementMasterId;
	}
	public void setLoanDisbursementMasterId(int loanDisbursementMasterId) {
		this.loanDisbursementMasterId = loanDisbursementMasterId;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public String getAmountPayType() {
		return amountPayType;
	}
	public void setAmountPayType(String amountPayType) {
		this.amountPayType = amountPayType;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getTransferAmount() {
		return transferAmount;
	}
	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getAmountPaidDate() {
		return amountPaidDate;
	}
	public void setAmountPaidDate(String amountPaidDate) {
		this.amountPaidDate = amountPaidDate;
	}
	
	
	
  }