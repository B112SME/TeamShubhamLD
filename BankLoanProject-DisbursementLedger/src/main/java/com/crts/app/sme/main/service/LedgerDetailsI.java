package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.dto.LedgerDetailsdto;
import com.crts.app.sme.main.model.LedgerDetails;

public interface LedgerDetailsI {

	void save(LedgerDetails ld);
	
	List<LedgerDetails> getAll();
	
	void save(LedgerDetailsdto lddto);
	
	List<LedgerDetailsdto> getLedgerDetailsDto();
}
