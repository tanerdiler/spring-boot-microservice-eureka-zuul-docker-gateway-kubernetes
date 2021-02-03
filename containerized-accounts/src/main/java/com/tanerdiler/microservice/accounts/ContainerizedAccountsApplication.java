package com.tanerdiler.microservice.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ContainerizedAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerizedAccountsApplication.class, args);
	}
}
