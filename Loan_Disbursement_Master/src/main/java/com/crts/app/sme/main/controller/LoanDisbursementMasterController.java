package com.crts.app.sme.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.sme.main.dto.LoanDisbursementMasterDto;
import com.crts.app.sme.main.model.LoanDisbursementmaster;
import com.crts.app.sme.main.service.LoanDisbursementMasterServiceI;



@RestController
public class LoanDisbursementMasterController
{
	@Autowired
	private LoanDisbursementMasterServiceI hs;
	
	@PostMapping("/log")
	public void savedata(@RequestBody LoanDisbursementmaster ed)
	{
	   hs.saveData(ed);
	   
	}
	@GetMapping("/getData")
	public List<LoanDisbursementmaster> getData()
	{
		
	List<LoanDisbursementmaster> ed=hs.getData();
		return ed;
		
	}

   
	@RequestMapping("/regdto")
	public String saveLoanPaymentDetailsDto(@RequestBody LoanDisbursementMasterDto loanpaymentdetailsdto)
	{
		hs.saveLoanPaymentDetailsDto(loanpaymentdetailsdto);
		
		return "Dto Save successfully";		
		
	}
	@RequestMapping("/getbydto")
	public List<LoanDisbursementMasterDto> getloanpaymentdetailsdto()
	{
	List<LoanDisbursementMasterDto> list=hs.getLoanPaymentDetailsDto();
		return list;


}
}