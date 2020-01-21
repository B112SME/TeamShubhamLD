package com.crts.app.sme.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.LedgerDetails;

@Repository
public interface LedgerDetailsRepository extends CrudRepository<LedgerDetails, Integer>
{

}
