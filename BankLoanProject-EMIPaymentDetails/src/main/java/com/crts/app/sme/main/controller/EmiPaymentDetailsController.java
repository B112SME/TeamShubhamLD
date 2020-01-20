package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.EmiPaymentDetails;
import com.crts.app.sme.main.service.EmiPaymentDetailsServiceI;

@RestController
public class EmiPaymentDetailsController
{  
	@Autowired
	private EmiPaymentDetailsServiceI hs;
	
	@PostMapping("/log")
	public void savedata(@RequestBody EmiPaymentDetails ed)
	{
		
	   hs.saveData(ed);
	   
	}
	@RequestMapping("/getData")
	public List<EmiPaymentDetails> getData()
	{
		
	List<EmiPaymentDetails> ed=hs.getData();
		return ed;
		
	}

}
