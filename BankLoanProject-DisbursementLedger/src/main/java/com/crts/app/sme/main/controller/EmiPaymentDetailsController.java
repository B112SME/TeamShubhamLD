package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.EmiPaymentDetails;
import com.crts.app.sme.main.service.EmiPaymentDetailsServiceI;

@RestController
@CrossOrigin("*")
public class EmiPaymentDetailsController
{  
	@Autowired
	private EmiPaymentDetailsServiceI hs;
	
	@PostMapping("/saveemi")
	public void savedata(@RequestBody EmiPaymentDetails ed)
	{		
	   hs.saveData(ed);
	}
}