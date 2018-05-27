package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Order;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class OrderRepository
{
	private final static Map<Integer, Order> orders = new HashMap<>();

	static {
		orders.put(1, new Order(1,1,1, 1,10d, 5d));
		orders.put(2, new Order(2,2,1, 2,10d, 5d));
		orders.put(3, new Order(3,3,1, 1,10d, 5d));
		orders.put(4, new Order(4,4,1, 1,10d, 5d));
		orders.put(5, new Order(5,1,2, 5,10d, 5d));
		orders.put(6, new Order(6,2,2, 1,10d, 5d));
		orders.put(7, new Order(7,3,2, 8,10d, 5d));
		orders.put(8, new Order(8,4,2, 1,10d, 5d));
		orders.put(9, new Order(9,1,3, 4,10d, 5d));
		orders.put(10, new Order(10,2,3, 1,10d, 5d));
		orders.put(11, new Order(11,3,3, 8,10d, 5d));
		orders.put(12, new Order(12,4,3, 2,10d, 5d));
		orders.put(13, new Order(13,1,4, 1,10d, 5d));
		orders.put(14, new Order(14,2,4, 4,10d, 5d));
		orders.put(15, new Order(15,3,4, 3,10d, 5d));
		orders.put(16, new Order(16,4,4, 1,10d, 5d));
	}

	public Optional<Order> findById(Integer id)
	{
		return Optional.ofNullable(orders.get(id));
	}

	public Optional<Collection<Order>> findAll()
	{
		return Optional.ofNullable(orders.values());
	}

	public Order save(Order order)
	{
		Integer maxId = orders.keySet().stream().max(Integer::compareTo).get();
		return orders.put(maxId, order);
	}
}
