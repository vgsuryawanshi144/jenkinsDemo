package com.fertilizers.agency.request;

import java.util.List;

public class OrderRequest
{
	CustomerDetails CustomerDetailsObject;
	List<Item> items;
	private float orderTotal;
	private String orderNumber;
	private String orderDate;

	// Getter Methods

	public CustomerDetails getCustomerDetails()
	{
		return CustomerDetailsObject;
	}

	public List<Item> getItmes()
	{
		return items;
	}

	public float getOrderTotal()
	{
		return orderTotal;
	}

	public String getOrderNumber()
	{
		return orderNumber;
	}

	public String getOrderDate()
	{
		return orderDate;
	}

	// Setter Methods

	public void setCustomerDetails(CustomerDetails customerDetailsObject)
	{
		this.CustomerDetailsObject = customerDetailsObject;
	}

	public void setItmes(List<Item> items)
	{
		this.items = items;
	}

	public void setOrderTotal(float orderTotal)
	{
		this.orderTotal = orderTotal;
	}

	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public void setOrderDate(String orderDate)
	{
		this.orderDate = orderDate;
	}

}
