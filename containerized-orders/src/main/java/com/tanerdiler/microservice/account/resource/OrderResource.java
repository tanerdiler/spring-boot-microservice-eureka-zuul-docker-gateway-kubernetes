package com.tanerdiler.microservice.account.resource;

import com.tanerdiler.microservice.account.exception.OrderNotFoundException;
import com.tanerdiler.microservice.account.model.Order;
import com.tanerdiler.microservice.account.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class OrderResource {
    @Autowired
    private OrderRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<Order> get(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(repository.findById(id).orElseThrow(() -> new OrderNotFoundException(id)));
    }

    @GetMapping("/all")
    public ResponseEntity<Collection<Order>> getAll() {
        return ResponseEntity.ok(repository.findAll().orElse(new ArrayList<>()));
    }

    @PostMapping("/new")
    public ResponseEntity<Order> createNewOrder(@RequestBody Order order) {
        return new ResponseEntity<>(repository.save(order), HttpStatus.CREATED);
    }

}
