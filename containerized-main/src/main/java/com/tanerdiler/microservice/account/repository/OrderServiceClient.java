package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
@FeignClient("containerized-orders")
public interface OrderServiceClient {
    @GetMapping(value = "/{orderId}")
    Order findById(@PathVariable("orderId") Integer orderId);

    @GetMapping(value = "/all")
    List<Order> findAll();
}
