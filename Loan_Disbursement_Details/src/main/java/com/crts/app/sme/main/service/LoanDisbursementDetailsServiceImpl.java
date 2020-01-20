package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crts.app.sme.main.dto.LoanDisbursementDetailsDto;
import com.crts.app.sme.main.model.LoanDisbursementDetails;
import com.crts.app.sme.main.repository.LoanDisbursementDetailsRepository;
import com.crts.app.sme.main.service.LoanDisbursementDetailsServiceI;

@Service
public class LoanDisbursementDetailsServiceImpl implements LoanDisbursementDetailsServiceI
{
	 
	@Autowired
	LoanDisbursementDetailsRepository hr;
	 
	 public void saveData(LoanDisbursementDetails ed) 
	 {
		hr.save(ed);
	}
	@Override
	public List<LoanDisbursementDetails> getData()
	{
		List<LoanDisbursementDetails>ed= (List<LoanDisbursementDetails>) hr.findAll();
		return ed;
	}
	
	@Override
	public List<LoanDisbursementDetailsDto> getLoanPaymentDetailsDto() 
	{
		
			List<LoanDisbursementDetails> loanpaymentdetailslist=(List<LoanDisbursementDetails>) hr.findAll();
			
			List<LoanDisbursementDetailsDto> loanpaymentdetailsdtolist=new ArrayList<>();
			ModelMapper md=new ModelMapper();
			for (LoanDisbursementDetails loan : loanpaymentdetailslist) {
				LoanDisbursementDetailsDto emd=md.map(loan, LoanDisbursementDetailsDto.class);
				loanpaymentdetailsdtolist.add(emd);
				
				
			}
			return loanpaymentdetailsdtolist;
		

	}
	
	@Override
	public void saveLoanPaymentDetailsDto(LoanDisbursementDetailsDto loanpaymentdetailsdto) 
	{
		ModelMapper m=new ModelMapper();
		LoanDisbursementDetails loand=m.map(loanpaymentdetailsdto, LoanDisbursementDetails.class);
		   hr.save(loand);
		
	}
}
