package com.tanerdiler.microservice.main.repository;

import com.tanerdiler.microservice.main.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient("containerized-accounts")
public interface AccountServiceClient
{

	@GetMapping(value = "/account/api/v1/accounts/{accountId}")
	Account findById(@PathVariable("accountId") Integer accountId);

	@GetMapping(value = "/account/api/v1/accounts")
	List<Account> findAll();

}
