package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.dto.LedgerDetailsdto;
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

	@Override
	public void save(LedgerDetailsdto lddto) {
		
		ModelMapper m=new ModelMapper();
		LedgerDetails ld=m.map(lddto, LedgerDetails.class);
		ldr.save(ld);
	}

	@Override
	public List<LedgerDetailsdto> getLedgerDetailsDto() {
		
		List<LedgerDetails> ldlist=(List<LedgerDetails>) ldr.findAll();
		List<LedgerDetailsdto> lddtolist=new ArrayList<LedgerDetailsdto>();
		
		ModelMapper m=new ModelMapper();
		for (LedgerDetails ledgerDetails : ldlist) {
			
			LedgerDetailsdto lddto=m.map(ledgerDetails, LedgerDetailsdto.class);
			lddtolist.add(lddto);
		}		   
		return lddtolist;
	}	
}