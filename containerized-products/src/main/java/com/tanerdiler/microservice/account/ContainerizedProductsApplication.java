package com.tanerdiler.microservice.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ContainerizedProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContainerizedProductsApplication.class, args);
    }
}
