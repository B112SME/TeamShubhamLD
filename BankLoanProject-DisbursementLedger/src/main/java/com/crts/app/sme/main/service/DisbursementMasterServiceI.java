package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.*;


public interface DisbursementMasterServiceI 
{
	public void saveData(LoanDisbursementMaster ed);
	public List<LoanDisbursementMaster> getData();
}
