package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.LoanDisbursementDetails;
import com.crts.app.sme.main.service.DisbursementDetailsServiceI;
@CrossOrigin("*")
@RestController
public class DisbursementDetailsController
{  
	@Autowired
	private DisbursementDetailsServiceI hs;
	
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

}
