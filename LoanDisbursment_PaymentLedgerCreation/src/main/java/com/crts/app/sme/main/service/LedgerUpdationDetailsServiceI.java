package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.dto.LedgerUpdationDetailsDto;
import com.crts.app.sme.main.model.LedgerUpdationDetails;


public interface LedgerUpdationDetailsServiceI 
{
	public void saveData(LedgerUpdationDetails lud);
	public List<LedgerUpdationDetails> getData();
	public void saveLedgerUpdationDetailsDto(LedgerUpdationDetailsDto emiptmdto);
	public List<LedgerUpdationDetailsDto> getLedgerUpdationDetailsDto();
	
}
