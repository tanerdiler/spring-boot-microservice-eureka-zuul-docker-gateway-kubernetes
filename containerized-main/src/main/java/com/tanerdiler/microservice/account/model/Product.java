package com.tanerdiler.microservice.account.model;

public class Product
{
	private Integer id;
	private String name;
	private Double price;

	public Product()
	{
	}

	public Product(Integer id, String name, Double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}
}
