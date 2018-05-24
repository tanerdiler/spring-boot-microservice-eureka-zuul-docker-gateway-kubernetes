package com.tanerdiler.microservice.account.model;

public class Account
{
	private Integer id;
	private String fullname;
	private String email;

	public Account()
	{
	}

	public Account(Integer id, String fullname, String email)
	{
		this.id = id;
		this.fullname = fullname;
		this.email = email;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getFullname()
	{
		return fullname;
	}

	public void setFullname(String fullname)
	{
		this.fullname = fullname;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}
