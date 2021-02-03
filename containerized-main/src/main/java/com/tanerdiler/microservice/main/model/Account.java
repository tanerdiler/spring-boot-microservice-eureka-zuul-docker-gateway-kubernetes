package com.tanerdiler.microservice.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private Integer id;
	private String fullname;
	private String email;
}
