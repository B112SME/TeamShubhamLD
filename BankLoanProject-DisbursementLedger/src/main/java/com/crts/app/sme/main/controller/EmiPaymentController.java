package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.EMIPayment;
import com.crts.app.sme.main.model.PaymentHistory;
import com.crts.app.sme.main.service.*;


@RestController
@CrossOrigin("*")
public class EmiPaymentController 
{
	@Autowired
	private EMIPaymentl hs;
	
	@PostMapping("/emilog")
	public String savedata(@RequestBody EMIPayment ep)
	{		
	   hs.saveData(ep);
	   return "Save Successfully";
	}
	
	@GetMapping("/emigetData")
	public List<EMIPayment> getData()
	{
		List<EMIPayment> ep=hs.getData();
		return ep;
	}

}
