package com.tanerdiler.microservice.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDTO {
    private final Integer id;
    private final Integer count;
    private final Double price;
    private final Double discountedPrice;
    private final String accountName;
    private final String productName;
}
