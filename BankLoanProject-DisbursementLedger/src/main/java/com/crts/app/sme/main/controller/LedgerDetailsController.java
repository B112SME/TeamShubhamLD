package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.dto.LedgerDetailsdto;
import com.crts.app.sme.main.model.LedgerDetails;
import com.crts.app.sme.main.service.LedgerDetailsI;

@RestController
@CrossOrigin("*")
public class LedgerDetailsController {
	
	@Autowired
	LedgerDetailsI ldi;

	@PostMapping("/reg")
	public void savedata(@RequestBody LedgerDetails ld)
	{
		ldi.save(ld);
	}
	
	@GetMapping("/getall")
	public List<LedgerDetails> getdata()
	{
		return ldi.getAll();
	}
	
	@RequestMapping("/regdto")
	public String saveDto(@RequestBody LedgerDetailsdto lddto)
	{
		ldi.save(lddto);		
		return "save successfully";		
	}
	
	@RequestMapping("/getalldto")
	public List<LedgerDetailsdto> getLadgerDto()
	{
		List<LedgerDetailsdto>list=ldi.getLedgerDetailsDto();
		return list;
	}
}
