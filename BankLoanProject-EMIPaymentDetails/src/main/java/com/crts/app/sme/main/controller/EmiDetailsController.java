package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.EmiDetails;
import com.crts.app.sme.main.service.EmiDetailsServiceI;

@RestController
public class EmiDetailsController
{  
	@Autowired
	private EmiDetailsServiceI hs;
	
	@PostMapping("/log")
	public void savedata(@RequestBody EmiDetails ed)
	{
		
	   hs.saveData(ed);
	   
	}
	@GetMapping("/getData")
	public List<EmiDetails> getData()
	{
		
	List<EmiDetails> ed=hs.getData();
		return ed;
		
	}

}
