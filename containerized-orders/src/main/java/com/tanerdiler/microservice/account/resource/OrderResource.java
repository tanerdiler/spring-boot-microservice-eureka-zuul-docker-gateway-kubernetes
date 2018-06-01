package com.tanerdiler.microservice.account.resource;

import com.tanerdiler.microservice.account.model.Order;
import com.tanerdiler.microservice.account.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderResource
{
	@Autowired
	private OrderRepository repository;

	@GetMapping("/{id}")
	public ResponseEntity<Order> get(@PathVariable("id") Integer id)
	{
		return ResponseEntity.ok(repository.findById(id).get());
	}

	@GetMapping()
	public ResponseEntity<Collection<Order>> getAll()
	{
		return ResponseEntity.ok(repository.findAll().get());
	}
}
