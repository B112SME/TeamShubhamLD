package com.crts.app.sme.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.LoanDisbursementDetails;
@Repository
public interface LoanDisbursementDetailsRepository extends CrudRepository<LoanDisbursementDetails, Integer>
{

	
	
}
