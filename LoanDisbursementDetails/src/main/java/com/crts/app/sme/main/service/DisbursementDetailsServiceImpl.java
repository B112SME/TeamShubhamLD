package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.LoanDisbursementDetails;
import com.crts.app.sme.main.repository.DisbursementDetailsRepository;


@Service
public class DisbursementDetailsServiceImpl implements DisbursementDetailsServiceI{
 @Autowired
 private DisbursementDetailsRepository hr;
 
 public void saveData(LoanDisbursementDetails ed) 
 {
	hr.save(ed);
}
@Override
public List<LoanDisbursementDetails> getData() {
	
	return (List<LoanDisbursementDetails>) hr.findAll();
}
	
	
}
