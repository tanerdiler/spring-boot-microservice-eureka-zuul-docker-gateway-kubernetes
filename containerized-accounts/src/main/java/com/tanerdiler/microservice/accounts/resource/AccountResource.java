package com.tanerdiler.microservice.accounts.resource;

import static java.lang.String.format;
import com.tanerdiler.microservice.accounts.model.Account;
import com.tanerdiler.microservice.accounts.repository.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/api/v1/accounts")
@RequiredArgsConstructor
public class AccountResource
{
	private final AccountRepository repository;
	private Random random = new Random();

	@GetMapping("/{id}")
	public ResponseEntity<Account> get(@PathVariable("id") Integer id)
	{
//		if (random.nextInt(100)<30) {
//			throw new RuntimeException(format("Account{%d} not found!", id));
//		}
		final var account = repository.findById(id).get();
		log.info("Account {} detail fetched {}", id, account);
		return ResponseEntity.ok(account);
	}

	@GetMapping()
	public ResponseEntity<Collection<Account>> getAll()
	{
//		if (random.nextInt(100)<30) {
//			throw new RuntimeException("Datasource not reached to fetch accounts!");
//		}
		final var accounts = (repository.findAll().get());
		log.info("Executing fetching all accounts {}", accounts);
		return ResponseEntity.ok(accounts);
	}
}
