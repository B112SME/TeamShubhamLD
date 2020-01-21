package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.*;

public interface EMIPaymentl 
{
	public void saveData(EMIPayment ph);
	public List<EMIPayment> getData();
}
