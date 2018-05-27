package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ProductRepository
{
	private final static Map<Integer, Product> products = new HashMap<>();

	static {
		products.put(1, new Product(1, "5 saatlik şarj aleti", 100d));
		products.put(2, new Product(2, "traş makinası", 5d));
		products.put(3, new Product(3, "klavye", 200d));
		products.put(4, new Product(4, "sırt çantası", 50d));
	}

	public Optional<Product> findById(Integer id)
	{
		return Optional.ofNullable(products.get(id));
	}

	public Optional<Collection<Product>> findAll() {
		return Optional.ofNullable(products.values());
	}
}
