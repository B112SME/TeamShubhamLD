package com.crts.app.smc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.smc.main.model.LoanPaymentDetails;
import com.crts.app.smc.main.repository.HomeRepository;
import com.crts.app.smc.main.serviceInt.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
	 @Autowired
	HomeRepository hr;
	 
	 public void saveData(LoanPaymentDetails ed) 
	 {
		hr.save(ed);
	}
	@Override
	public List<LoanPaymentDetails> getData() {
		List<LoanPaymentDetails>ed= (List<LoanPaymentDetails>) hr.findAll();
		return ed;
	}
}
