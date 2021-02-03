package com.tanerdiler.microservice.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private Integer id;
	private Integer productId;
	private Integer accountId;
	private Integer count;
	private Double price;
	private Double discountedPrice;

	public Order(Integer productId, Integer accountId, Integer count, Double price, Double discountedPrice) {
		this.productId = productId;
		this.accountId = accountId;
		this.count = count;
		this.price = price;
		this.discountedPrice = discountedPrice;
	}
}
