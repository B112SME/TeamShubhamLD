package com.crts.app.sme.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.sme.main.dto.LoanPaymentDetailsDto;
import com.crts.app.sme.main.model.LoanPaymentDetails;
import com.crts.app.sme.main.service.LoanPaymentDetailsServiceI;



@RestController
public class LoanPaymentDetailsController
{
	@Autowired
	private LoanPaymentDetailsServiceI hs;
	
	@PostMapping("/log")
	public void savedata(@RequestBody LoanPaymentDetails ed)
	{
	   hs.saveData(ed);
	   
	}
	@GetMapping("/getData")
	public List<LoanPaymentDetails> getData()
	{
		
	List<LoanPaymentDetails> ed=hs.getData();
		return ed;
		
	}

   
	@RequestMapping("/regdto")
	public String saveLoanPaymentDetailsDto(@RequestBody LoanPaymentDetailsDto loanpaymentdetailsdto)
	{
		hs.saveLoanPaymentDetailsDto(loanpaymentdetailsdto);
		
		return "Dto Save successfully";		
		
	}
	@RequestMapping("/getbydto")
	public List<LoanPaymentDetailsDto> getloanpaymentdetailsdto()
	{
	List<LoanPaymentDetailsDto> list=hs.getLoanPaymentDetailsDto();
		return list;


}
}