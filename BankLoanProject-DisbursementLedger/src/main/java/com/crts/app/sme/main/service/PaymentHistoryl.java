package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.*;

public interface PaymentHistoryl 
{
	public void saveData(PaymentHistory ph);
	public List<PaymentHistory> getData();
}
