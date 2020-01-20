package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.LoanDisbursementMaster;
import com.crts.app.sme.main.service.DisbursementMasterServiceI;


@RestController
public class DisbursementMasterController
{  
	@Autowired
	private DisbursementMasterServiceI hs;
	
	@PostMapping("/log")
	public void savedata(@RequestBody LoanDisbursementMaster ed)
	{
		
	   hs.saveData(ed);
	   
	}
	@GetMapping("/getData")
	public List<LoanDisbursementMaster> getData()
	{
		
	List<LoanDisbursementMaster> ed=hs.getData();
		return ed;
		
	}

}
