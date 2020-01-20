package com.crts.app.sme.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.sme.main.dto.LoanDisbursementDetailsDto;
import com.crts.app.sme.main.model.LoanDisbursementDetails;
import com.crts.app.sme.main.service.LoanDisbursementDetailsServiceI;



@RestController
public class LoanDisbursementDetailsController
{
	@Autowired
	private LoanDisbursementDetailsServiceI hs;
	
	@PostMapping("/log")
	public void savedata(@RequestBody LoanDisbursementDetails ed)
	{
	   hs.saveData(ed);
	   
	}
	@GetMapping("/getData")
	public List<LoanDisbursementDetails> getData()
	{
		
	List<LoanDisbursementDetails> ed=hs.getData();
		return ed;
		
	}

   
	@RequestMapping("/regdto")
	public String saveLoanPaymentDetailsDto(@RequestBody LoanDisbursementDetailsDto loanpaymentdetailsdto)
	{
		hs.saveLoanPaymentDetailsDto(loanpaymentdetailsdto);
		
		return "Dto Save successfully";		
		
	}
	@RequestMapping("/getbydto")
	public List<LoanDisbursementDetailsDto> getloanpaymentdetailsdto()
	{
	List<LoanDisbursementDetailsDto> list=hs.getLoanPaymentDetailsDto();
		return list;


}
}