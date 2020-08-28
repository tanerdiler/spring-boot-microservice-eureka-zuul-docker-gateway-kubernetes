package com.tanerdiler.microservice.account.model;

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
}
