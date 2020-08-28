package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient("containerized-products")
public interface ProductServiceClient {
    @GetMapping(value = "/{productId}")
    Product findById(@PathVariable("productId") Integer orderId);

    @GetMapping(value = "/all")
    List<Product> findAll();
}
