package com.tanerdiler.microservice.main.config;

import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenFeignConfiguration {
    
    @Autowired
    private RibbonLoadBalancerClient ribbonLoadBalancerClient;
    
    @Bean
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}