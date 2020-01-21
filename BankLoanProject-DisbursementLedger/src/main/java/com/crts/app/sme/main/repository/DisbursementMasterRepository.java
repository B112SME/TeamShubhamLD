package com.crts.app.sme.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.LoanDisbursementMaster;

@Repository
public interface DisbursementMasterRepository extends CrudRepository<LoanDisbursementMaster, Integer>
{
	
	
}
