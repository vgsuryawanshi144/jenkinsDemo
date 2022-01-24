package com.fertilizers.agency.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	private String orderNumber;
	private String weight;
	private Date expiryOfDelivery;
	private double fertilizersPrice;
	private double delveiryCharges;
	private String deliveyPersonContact;
	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;
	
	
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getOrderNumber()
	{
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}
	public String getWeight()
	{
		return weight;
	}
	public void setWeight(String weight)
	{
		this.weight = weight;
	}
	public Date getExpiryOfCylinder()
	{
		return expiryOfDelivery;
	}
	public void setExpiryOfCylinder(Date expiryOfCylinder)
	{
		this.expiryOfDelivery = expiryOfCylinder;
	}
	public double getCylinderPrice()
	{
		return fertilizersPrice;
	}
	public void setCylinderPrice(double fertilizersPrice)
	{
		this.fertilizersPrice = fertilizersPrice;
	}
	public double getDelveiryCharges()
	{
		return delveiryCharges;
	}
	public void setDelveiryCharges(double delveiryCharges)
	{
		this.delveiryCharges = delveiryCharges;
	}
	public String getDeliveyPersonContact()
	{
		return deliveyPersonContact;
	}
	public void setDeliveyPersonContact(String deliveyPersonContact)
	{
		this.deliveyPersonContact = deliveyPersonContact;
	}
	public Customer getCustomer()
	{
		return customer;
	}
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
}
