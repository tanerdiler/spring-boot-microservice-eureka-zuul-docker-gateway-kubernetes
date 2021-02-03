package com.tanerdiler.microservice.main.repository;

import com.tanerdiler.microservice.main.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient("containerized-products")
public interface ProductServiceClient
{
	@GetMapping(value = "/api/v1/products/{productId}")
	Product findById(@PathVariable("productId") Integer orderId);

	@GetMapping(value = "/api/v1/products")
	List<Product> findAll();
}
