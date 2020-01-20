package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.LedgerDetails;
import com.crts.app.sme.main.repository.LedgerDetailsRepository;

@Service
public class LedgerDetailsImpl implements LedgerDetailsI {

	@Autowired
	LedgerDetailsRepository ldr;
	
	@Override
	public void save(LedgerDetails ld) {

		ldr.save(ld);
	}

	@Override
	public List<LedgerDetails> getAll() {
		
		return ldr.findAll();
	}

}
