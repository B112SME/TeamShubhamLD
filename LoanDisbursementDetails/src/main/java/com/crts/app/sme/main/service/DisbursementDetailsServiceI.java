package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.LoanDisbursementDetails;


public interface DisbursementDetailsServiceI {
	public void saveData(LoanDisbursementDetails ldd);
	public List<LoanDisbursementDetails> getData();
}
