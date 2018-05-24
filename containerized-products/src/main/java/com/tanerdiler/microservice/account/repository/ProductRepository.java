package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ProductRepository
{
	private final static Map<Integer, Product> accounts = new HashMap<>();

	static {
		accounts.put(1, new Product(1, "5 saatlik şarj aleti", 100d));
		accounts.put(2, new Product(2, "traş makinası", 5d));
		accounts.put(3, new Product(3, "klavye", 200d));
		accounts.put(4, new Product(4, "sırt çantası", 50d));
	}

	public Optional<Product> findById(Integer id)
	{
		return Optional.ofNullable(accounts.get(id));
	}
}
