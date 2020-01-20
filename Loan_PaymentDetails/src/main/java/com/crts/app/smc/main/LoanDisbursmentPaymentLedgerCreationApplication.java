package com.crts.app.smc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class LoanDisbursmentPaymentLedgerCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanDisbursmentPaymentLedgerCreationApplication.class, args);
	}

}
