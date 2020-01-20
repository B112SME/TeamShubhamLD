package com.crts.app.smc.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.smc.main.model.LoanPaymentDetails;
import com.crts.app.smc.main.serviceInt.HomeServiceI;



@RestController
public class HomeController
{
	@Autowired
	private HomeServiceI hs;
	
	@PostMapping("/log")
	public String savedata(@RequestBody LoanPaymentDetails ed)
	{
		System.out.println(ed);
	   hs.saveData(ed);
	   
	return "Save Successlly";
	}
	@GetMapping("/getData")
	public List<LoanPaymentDetails> getData()
	{
		
	List<LoanPaymentDetails> ed=hs.getData();
		return ed;
		
	}




}
