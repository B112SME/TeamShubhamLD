package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crts.app.sme.main.model.PaymentHistory;
import com.crts.app.sme.main.repository.PaymentHistoryRepository;

public class PaymentHistoryImpl implements PaymentHistoryl 
{
	@Autowired
	private PaymentHistoryRepository hr;
	@Override
	public void saveData(PaymentHistory ph) 
	{
		hr.save(ph);
	}

	@Override
	public List<PaymentHistory> getData()
	{
		List<PaymentHistory>ph= (List<PaymentHistory>) hr.findAll();
		return ph;
	}

}
