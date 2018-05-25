package com.tanerdiler.microservice.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaServer
public class ContainerizedDiscoveryApplication
{
	public static void main(String[] args) {
		SpringApplication.run(ContainerizedDiscoveryApplication.class, args);
	}
}
