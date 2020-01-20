package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.*;

public interface PaymentHistoryl 
{
	void saveData(PaymentHistory ph);
	
	List<PaymentHistory> getData();
}
