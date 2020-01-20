package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.dto.LoanDisbursementMasterDto;
import com.crts.app.sme.main.model.LoanDisbursementmaster;

public interface LoanDisbursementMasterServiceI 
{
	public void saveData(LoanDisbursementmaster ed);
	public List<LoanDisbursementmaster> getData();
	public List<LoanDisbursementMasterDto> getLoanPaymentDetailsDto();
	public void saveLoanPaymentDetailsDto(LoanDisbursementMasterDto loanpaymentdetailsdto);
}
