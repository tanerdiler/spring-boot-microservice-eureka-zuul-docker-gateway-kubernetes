package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient("containerized-accounts")
public interface AccountServiceClient {

    @GetMapping(value = "/{accountId}")
    Account findById(@PathVariable("accountId") Integer accountId);

    @GetMapping(value = "/all")
    List<Account> findAll();

}
