package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.dto.LoanPaymentDetailsDto;
import com.crts.app.sme.main.model.LoanPaymentDetails;

public interface LoanPaymentDetailsServiceI 
{
	public void saveData(LoanPaymentDetails ed);
	public List<LoanPaymentDetails> getData();
	public List<LoanPaymentDetailsDto> getLoanPaymentDetailsDto();
	public void saveLoanPaymentDetailsDto(LoanPaymentDetailsDto loanpaymentdetailsdto);
}
