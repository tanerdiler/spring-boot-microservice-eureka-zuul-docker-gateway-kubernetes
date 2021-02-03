package com.tanerdiler.microservice.main.dto;

import lombok.Data;

@Data
public class OrderDTO {

	private final Integer id;
	private final Integer count;
	private final Double price;
	private final Double discountedPrice;
	private final String accountName;
	private final String productName;
}
