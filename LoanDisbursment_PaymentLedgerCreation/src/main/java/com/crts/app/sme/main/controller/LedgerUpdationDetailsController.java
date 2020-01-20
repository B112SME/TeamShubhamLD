package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.dto.LedgerUpdationDetailsDto;
import com.crts.app.sme.main.model.LedgerUpdationDetails;
import com.crts.app.sme.main.service.LedgerUpdationDetailsServiceI;

@RestController
public class LedgerUpdationDetailsController 
{
	@Autowired
	private LedgerUpdationDetailsServiceI ludServiceI;
	
	@PostMapping("/regludetails")
	public void savedata(@RequestBody LedgerUpdationDetails lud)
	{
		
	   ludServiceI.saveData(lud);
	   
	}
	@RequestMapping("/getemiptmdata")
	public List<LedgerUpdationDetails> getData()
	{
		
	List<LedgerUpdationDetails> ed=ludServiceI.getData();
		return ed;
		
	}
	@RequestMapping("/regemiptmdto")
	public String saveDto(@RequestBody LedgerUpdationDetailsDto emiptmdto)
	{
		ludServiceI.saveLedgerUpdationDetailsDto(emiptmdto);
		
		return "EmiPaymentDetailsDto save successfully";
		
	}
	@RequestMapping("/getemiPayment")
	public List<LedgerUpdationDetailsDto> getEmiPaymentDeatilsDto()
	{
		List<LedgerUpdationDetailsDto>list=ludServiceI.getLedgerUpdationDetailsDto();
		return list;
	}
}
