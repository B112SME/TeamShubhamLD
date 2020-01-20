package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crts.app.sme.main.dto.LoanDisbursementMasterDto;
import com.crts.app.sme.main.model.LoanDisbursementmaster;
import com.crts.app.sme.main.repository.LoanDisbursementMasterRepository;
import com.crts.app.sme.main.service.LoanDisbursementMasterServiceI;

@Service
public class LoanDisbursementMasterServiceImpl implements LoanDisbursementMasterServiceI
{
	 
	@Autowired
	LoanDisbursementMasterRepository hr;
	 
	 public void saveData(LoanDisbursementmaster ed) 
	 {
		hr.save(ed);
	}
	@Override
	public List<LoanDisbursementmaster> getData()
	{
		List<LoanDisbursementmaster>ed= (List<LoanDisbursementmaster>) hr.findAll();
		return ed;
	}
	
	@Override
	public List<LoanDisbursementMasterDto> getLoanPaymentDetailsDto() 
	{
		
			List<LoanDisbursementmaster> loanpaymentdetailslist=(List<LoanDisbursementmaster>) hr.findAll();
			
			List<LoanDisbursementMasterDto> loanpaymentdetailsdtolist=new ArrayList<>();
			ModelMapper md=new ModelMapper();
			for (LoanDisbursementmaster loan : loanpaymentdetailslist) {
				LoanDisbursementMasterDto emd=md.map(loan, LoanDisbursementMasterDto.class);
				loanpaymentdetailsdtolist.add(emd);
				
				
			}
			return loanpaymentdetailsdtolist;
		

	}
	
	@Override
	public void saveLoanPaymentDetailsDto(LoanDisbursementMasterDto loanpaymentdetailsdto) 
	{
		ModelMapper m=new ModelMapper();
		LoanDisbursementmaster loand=m.map(loanpaymentdetailsdto, LoanDisbursementmaster.class);
		   hr.save(loand);
		
	}
}
