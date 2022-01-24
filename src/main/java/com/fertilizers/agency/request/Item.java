package com.fertilizers.agency.request;

public class Item
{
	private String pid;
	private String name;
	private float qty;
	private float price;

	// Getter Methods

	public String getPid()
	{
		return pid;
	}

	public String getName()
	{
		return name;
	}

	public float getQty()
	{
		return qty;
	}

	public float getPrice()
	{
		return price;
	}

	// Setter Methods

	public void setPid(String pid)
	{
		this.pid = pid;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setQty(float qty)
	{
		this.qty = qty;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}
}
