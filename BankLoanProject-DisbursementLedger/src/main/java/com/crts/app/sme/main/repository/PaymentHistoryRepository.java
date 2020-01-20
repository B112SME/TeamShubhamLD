package com.crts.app.sme.main.repository;

import com.crts.app.sme.main.model.*;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentHistoryRepository extends CrudRepository<PaymentHistory,Integer>{

	List<PaymentHistory> findAll();
}
