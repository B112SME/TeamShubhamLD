package com.crts.app.sme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan
@EnableJpaRepositories
@EnableEurekaClient
@SpringBootApplication
public class BankLoanProjectDisbursementLedgerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankLoanProjectDisbursementLedgerApplication.class, args);
	}

}
