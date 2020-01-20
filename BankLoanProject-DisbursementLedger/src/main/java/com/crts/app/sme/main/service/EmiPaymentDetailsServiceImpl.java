package com.crts.app.sme.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.EmiPaymentDetails;
import com.crts.app.sme.main.repository.EmiPaymentDetailsRepository;
import com.crts.app.sme.main.service.EmiPaymentDetailsServiceI;

@Service
public class EmiPaymentDetailsServiceImpl implements EmiPaymentDetailsServiceI{
 
	@Autowired
	private EmiPaymentDetailsRepository hr;

	@Override
	public void saveData(EmiPaymentDetails ed) {
		
		hr.save(ed);
	}
}
