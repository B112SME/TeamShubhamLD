package com.crts.app.sme.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.model.EmiDetails;
import com.crts.app.sme.main.repository.EmiDetailsRepository;

@Service
public class EmiDetailsServiceImpl implements EmiDetailsServiceI{
 @Autowired
 private EmiDetailsRepository hr;

@Override
public void saveData(EmiDetails ed) {
	hr.save(ed);
	
}

@Override
public List<EmiDetails> getData() {
	List<EmiDetails> list=(List<EmiDetails>) hr.findAll();
	return  list;
}
	
}
