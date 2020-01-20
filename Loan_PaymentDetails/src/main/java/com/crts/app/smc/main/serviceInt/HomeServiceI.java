package com.crts.app.smc.main.serviceInt;

import java.util.List;

import com.crts.app.smc.main.model.LoanPaymentDetails;

public interface HomeServiceI {
	public void saveData(LoanPaymentDetails ed);
	public List<LoanPaymentDetails> getData();
}
