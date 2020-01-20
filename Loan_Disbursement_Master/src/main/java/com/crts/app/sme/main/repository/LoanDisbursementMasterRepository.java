package com.crts.app.sme.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.LoanDisbursementmaster;
@Repository
public interface LoanDisbursementMasterRepository extends CrudRepository<LoanDisbursementmaster, Integer>
{

	
	
}
