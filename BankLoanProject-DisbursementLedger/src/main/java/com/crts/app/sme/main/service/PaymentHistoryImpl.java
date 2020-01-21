package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.dto.PaymentHistorydto;
import com.crts.app.sme.main.model.PaymentHistory;
import com.crts.app.sme.main.repository.PaymentHistoryRepository;

@Service
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

	@Override
	public void saveHistoryPaymentDto(PaymentHistorydto paydto)
	{
		ModelMapper m=new ModelMapper();
		PaymentHistory payhistory=m.map(paydto, PaymentHistory.class);
		hr.save(payhistory);
		
	}

	@Override
	public List<PaymentHistorydto> getPaymentHistoryDto() 
	{
		List<PaymentHistory> paylist=(List<PaymentHistory>) hr.findAll();
		List<PaymentHistorydto> paydtolist=new ArrayList<PaymentHistorydto>();
		ModelMapper m=new ModelMapper();
		
		for (PaymentHistory list : paylist) 
		{
			PaymentHistorydto payhisdto=m.map(list, PaymentHistorydto.class);
			paydtolist.add(payhisdto);
		}
		
		return paydtolist;
	}

}
