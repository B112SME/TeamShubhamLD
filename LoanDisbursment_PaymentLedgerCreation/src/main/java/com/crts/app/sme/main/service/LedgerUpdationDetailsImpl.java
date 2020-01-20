package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.dto.LedgerUpdationDetailsDto;
import com.crts.app.sme.main.model.LedgerUpdationDetails;
import com.crts.app.sme.main.repository.LedgerUpdationDetailsRepository;

@Service
public class LedgerUpdationDetailsImpl implements LedgerUpdationDetailsServiceI 
{
	@Autowired
	private LedgerUpdationDetailsRepository ludrep;
	@Override
	public void saveData(LedgerUpdationDetails lud) 
	{
		ludrep.save(lud);	
	}

	@Override
	public List<LedgerUpdationDetails> getData() 
	{
		List<LedgerUpdationDetails>list=(List<LedgerUpdationDetails>) ludrep.findAll();
		return list;
	}

	@Override
	public void saveLedgerUpdationDetailsDto(LedgerUpdationDetailsDto ludetdto) 
	{
		ModelMapper m=new ModelMapper();
		LedgerUpdationDetails luddtl=m.map(ludetdto, LedgerUpdationDetails.class);
		ludrep.save(luddtl);	
	}

	@Override
	public List<LedgerUpdationDetailsDto> getLedgerUpdationDetailsDto() 
	{
		List<LedgerUpdationDetails> lulist=(List<LedgerUpdationDetails>) ludrep.findAll();
		List<LedgerUpdationDetailsDto> ludlist=new ArrayList<LedgerUpdationDetailsDto>();
		
		ModelMapper m=new ModelMapper();
		for (LedgerUpdationDetails ledgerUpdationDetails : lulist) {
			
			LedgerUpdationDetailsDto ludetdto=m.map(ledgerUpdationDetails, LedgerUpdationDetailsDto.class);
			ludlist.add(ludetdto);
		}
		   
		return ludlist;
	}

}
