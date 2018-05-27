package com.tanerdiler.microservice.account.repository;

import com.tanerdiler.microservice.account.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient("containerized-accounts")
public interface AccountServiceClient
{

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/accounts/{accountId}")
	Account findById(@PathVariable("accountId") Integer accountId);

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/accounts")
	List<Account> findAll();

}
