package com.tanerdiler.microservice.accounts.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

	private Integer id;
	private String fullname;
	private String email;
}
