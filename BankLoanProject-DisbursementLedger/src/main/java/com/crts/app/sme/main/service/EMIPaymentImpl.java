package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.EMIPayment;
import com.crts.app.sme.main.model.PaymentHistory;
import com.crts.app.sme.main.repository.EMIPaymentRepository;
import com.crts.app.sme.main.repository.PaymentHistoryRepository;
@Service
public class EMIPaymentImpl implements EMIPaymentl 
{
	@Autowired
	private EMIPaymentRepository hr;
	@Override
	public void saveData(EMIPayment ep) 
	{
		hr.save(ep);
	}

	@Override
	public List<EMIPayment> getData()
	{
		List<EMIPayment>ep= (List<EMIPayment>) hr.findAll();
		return ep;
	}

}
