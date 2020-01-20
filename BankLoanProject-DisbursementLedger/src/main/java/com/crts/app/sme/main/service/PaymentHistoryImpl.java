package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.PaymentHistory;
import com.crts.app.sme.main.repository.PaymentHistoryRepository;

@Service
public class PaymentHistoryImpl implements PaymentHistoryl 
{
	@Autowired
	private PaymentHistoryRepository phr;
	
	@Override
	public void saveData(PaymentHistory ph) 
	{
		phr.save(ph);
	}

	@Override
	public List<PaymentHistory> getData()
	{
		return phr.findAll();
	}

}
