package com.tanerdiler.microservice.account.resource;

import com.tanerdiler.microservice.account.model.Product;
import com.tanerdiler.microservice.account.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/products")
public class ProductResource
{
	@Autowired
	private ProductRepository repository;

	@GetMapping("/{id}")
	public ResponseEntity<Product> get(@PathVariable("id") Integer id)
	{
		return ResponseEntity.ok(repository.findById(id).get());
	}

	@GetMapping()
	public ResponseEntity<Collection<Product>> getAll()
	{
		return ResponseEntity.ok(repository.findAll().get());
	}
}
