package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.sme.main.model.LoanDisbursementMaster;
import com.crts.app.sme.main.service.DisbursementMasterServiceI;


@RestController
@CrossOrigin("*")
public class DisbursementMasterController
{  
	@Autowired
	private DisbursementMasterServiceI hs;
	
	@RequestMapping(value = "/dislog", method = RequestMethod.POST)
	public void save(@RequestBody LoanDisbursementMaster ed)
	{
		System.out.println(ed+"Disbursement Service ");
	   hs.saveData(ed);
	}
	
	@GetMapping("/disgetData")
	public List<LoanDisbursementMaster> getData()
	{
		
	List<LoanDisbursementMaster> ed=hs.getData();
		return ed;
		
	}

}
