package com.tanerdiler.microservice.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableDiscoveryClient
public class ContainerizedAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerizedAccountsApplication.class, args);
	}
}
