package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.LoanDisbursementMaster;
import com.crts.app.sme.main.repository.DisbursementMasterRepository;

@Service
public class DisbursementMasterServiceImpl implements DisbursementMasterServiceI 
{
	@Autowired
	private DisbursementMasterRepository hr;
	
	
	@Override
	public List<LoanDisbursementMaster> getData()
	{
		List<LoanDisbursementMaster> ed = (List<LoanDisbursementMaster>) hr.findAll();
		return ed;
	}


	@Override
	public void saveData(LoanDisbursementMaster ed) 
	{
		hr.save(ed);
		
	}

}
