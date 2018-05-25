package com.tanerdiler.microservice.account.dto;

public class OrderDTO
{
	private final Integer id;
	private final Integer count;
	private final Double price;
	private final Double discountedPrice;
	private final String accountName;
	private final String productName;

	public OrderDTO(Integer id, Integer count, Double price, Double discountedPrice, String accountName, String productName)
	{

		this.id = id;
		this.count = count;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.accountName = accountName;
		this.productName = productName;
	}

	public Integer getId()
	{
		return id;
	}

	public Integer getCount()
	{
		return count;
	}

	public Double getPrice()
	{
		return price;
	}

	public Double getDiscountedPrice()
	{
		return discountedPrice;
	}

	public String getAccountName()
	{
		return accountName;
	}

	public String getProductName()
	{
		return productName;
	}
}
