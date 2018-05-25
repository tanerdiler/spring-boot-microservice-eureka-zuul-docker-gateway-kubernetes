package com.tanerdiler.microservice.account.model;

public class Order
{
	private Integer id;
	private Integer productId;
	private Integer accountId;
	private Integer count;
	private Double price;
	private Double discountedPrice;

	public Order()
	{
	}

	public Order(Integer productId, Integer accountId, Integer count, Double price, Double discountedPrice)
	{
		this.productId = productId;
		this.accountId = accountId;
		this.count = count;
		this.price = price;
		this.discountedPrice = discountedPrice;
	}

	public Order(Integer id, Integer productId, Integer accountId, Integer count, Double price, Double discountedPrice)
	{
		this.id = id;
		this.productId = productId;
		this.accountId = accountId;
		this.count = count;
		this.price = price;
		this.discountedPrice = discountedPrice;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getProductId()
	{
		return productId;
	}

	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}

	public Integer getAccountId()
	{
		return accountId;
	}

	public void setAccountId(Integer accountId)
	{
		this.accountId = accountId;
	}

	public Integer getCount()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		this.count = count;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public Double getDiscountedPrice()
	{
		return discountedPrice;
	}

	public void setDiscountedPrice(Double discountedPrice)
	{
		this.discountedPrice = discountedPrice;
	}
}
