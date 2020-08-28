package com.tanerdiler.microservice.account.exception;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(Integer id) {
        super("Account not found with id " + id);
    }
}
