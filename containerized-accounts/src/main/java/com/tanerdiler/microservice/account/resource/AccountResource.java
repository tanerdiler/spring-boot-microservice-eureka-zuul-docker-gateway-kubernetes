package com.tanerdiler.microservice.account.resource;

import com.tanerdiler.microservice.account.model.Account;
import com.tanerdiler.microservice.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountResource
{
	@Autowired
	private AccountRepository repository;

	@GetMapping("/{id}")
	public ResponseEntity<Account> get(@PathVariable("id") Integer id)
	{
		return ResponseEntity.ok(repository.findById(id).get());
	}
}
