package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.app.service.IAccountListAndTransactionEnquiryService"})
public class ViewAccountAndTransactionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewAccountAndTransactionAppApplication.class, args);
	}

}
