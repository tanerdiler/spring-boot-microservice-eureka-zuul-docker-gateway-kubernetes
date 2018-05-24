package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Order;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class OrderRepository
{
	private final static Map<Integer, Order> orders = new HashMap<>();

	static {
		orders.put(1, new Order(1,1, 1, 1,10d, 5d));
	}
	public Optional<Order> findById(Integer id)
	{
		return Optional.ofNullable(orders.get(id));
	}

	public Order save(Order order)
	{
		Integer maxId = orders.keySet().stream().max(Integer::compareTo).get();
		return orders.put(maxId, order);
	}
}
