package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.dto.LoanDisbursementDetailsDto;
import com.crts.app.sme.main.model.LoanDisbursementDetails;

public interface LoanDisbursementDetailsServiceI 
{
	public void saveData(LoanDisbursementDetails ed);
	public List<LoanDisbursementDetails> getData();
	public List<LoanDisbursementDetailsDto> getLoanPaymentDetailsDto();
	public void saveLoanPaymentDetailsDto(LoanDisbursementDetailsDto loanpaymentdetailsdto);
}
