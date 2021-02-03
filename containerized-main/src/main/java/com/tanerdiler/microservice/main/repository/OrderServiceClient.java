package com.tanerdiler.microservice.main.repository;

import com.tanerdiler.microservice.main.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient("containerized-orders")
public interface OrderServiceClient
{
	@GetMapping(value = "/api/v1/orders/{orderId}")
	Order findById(@PathVariable("orderId") Integer orderId);

	@GetMapping(value = "/api/v1/orders")
	List<Order> findAll();
}
