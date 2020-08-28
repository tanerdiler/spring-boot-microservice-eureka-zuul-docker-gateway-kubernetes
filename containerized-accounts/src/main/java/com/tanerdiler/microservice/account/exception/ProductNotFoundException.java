package com.tanerdiler.microservice.account.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Integer id) {
        super("Product not gound with id" + id);
    }
}
