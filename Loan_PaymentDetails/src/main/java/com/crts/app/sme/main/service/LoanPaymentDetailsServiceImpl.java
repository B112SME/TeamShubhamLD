package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crts.app.sme.main.dto.LoanPaymentDetailsDto;
import com.crts.app.sme.main.model.LoanPaymentDetails;
import com.crts.app.sme.main.repository.LoanPaymentDetailsRepository;
import com.crts.app.sme.main.service.LoanPaymentDetailsServiceI;

@Service
public class LoanPaymentDetailsServiceImpl implements LoanPaymentDetailsServiceI
{
	 
	@Autowired
	LoanPaymentDetailsRepository hr;
	 
	 public void saveData(LoanPaymentDetails ed) 
	 {
		hr.save(ed);
	}
	@Override
	public List<LoanPaymentDetails> getData()
	{
		List<LoanPaymentDetails>ed= (List<LoanPaymentDetails>) hr.findAll();
		return ed;
	}
	
	@Override
	public List<LoanPaymentDetailsDto> getLoanPaymentDetailsDto() 
	{
		
			List<LoanPaymentDetails> loanpaymentdetailslist=(List<LoanPaymentDetails>) hr.findAll();
			
			List<LoanPaymentDetailsDto> loanpaymentdetailsdtolist=new ArrayList<>();
			ModelMapper md=new ModelMapper();
			for (LoanPaymentDetails loan : loanpaymentdetailslist) {
				LoanPaymentDetailsDto emd=md.map(loan, LoanPaymentDetailsDto.class);
				loanpaymentdetailsdtolist.add(emd);
				
				
			}
			return loanpaymentdetailsdtolist;
		

	}
	
	@Override
	public void saveLoanPaymentDetailsDto(LoanPaymentDetailsDto loanpaymentdetailsdto) 
	{
		ModelMapper m=new ModelMapper();
		LoanPaymentDetails loand=m.map(loanpaymentdetailsdto, LoanPaymentDetails.class);
		   hr.save(loand);
		
	}
}
