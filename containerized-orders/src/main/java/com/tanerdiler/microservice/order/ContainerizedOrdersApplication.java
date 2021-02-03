package com.tanerdiler.microservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ContainerizedOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerizedOrdersApplication.class, args);
	}
}
