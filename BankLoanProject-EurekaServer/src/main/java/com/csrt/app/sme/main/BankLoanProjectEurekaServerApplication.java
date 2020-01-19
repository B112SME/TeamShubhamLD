package com.csrt.app.sme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankLoanProjectEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankLoanProjectEurekaServerApplication.class, args);
	}

}
