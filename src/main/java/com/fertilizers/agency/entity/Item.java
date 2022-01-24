package com.fertilizers.agency.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity()
@Table(name = "itmes")
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String pid;

	@Column(name = "name")
	private String name;

	@Column(name = "quantity")
	private float qty;

	@Column(name = "price")
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
