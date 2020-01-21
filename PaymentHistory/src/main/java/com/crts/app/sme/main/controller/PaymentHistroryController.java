package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.PaymentHistory;
import com.crts.app.sme.main.service.PaymentHistoryl;


@RestController
@CrossOrigin("*")
public class PaymentHistroryController 
{
	@Autowired
	private PaymentHistoryl hs;
	
	@PostMapping("/paylog")
	public String savedata(@RequestBody PaymentHistory ph)
	{		
	   hs.saveData(ph);
	   return "Save Successfully";
	}
	
	@GetMapping("/paygetData")
	public List<PaymentHistory> getData()
	{
		List<PaymentHistory> ph=hs.getData();
		return ph;
	}

}
