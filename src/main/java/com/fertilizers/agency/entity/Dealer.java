package com.fertilizers.agency.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "dealer")
public class Dealer
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "dealer_name")
	private String dealerName;

	@Column(name = "dealer_address")
	private String dealerAddress;

	@Column(name = "dealer_contact")
	private int dealerContact;

	@Column(name = "license_number")
	private int licenseNumber;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getDealerName()
	{
		return dealerName;
	}

	public void setDealerName(String dealerName)
	{
		this.dealerName = dealerName;
	}

	public String getDealerAddress()
	{
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress)
	{
		this.dealerAddress = dealerAddress;
	}

	public int getDealerContact()
	{
		return dealerContact;
	}

	public void setDealerContact(int dealerContact)
	{
		this.dealerContact = dealerContact;
	}

	public int getLicenseNumber()
	{
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber)
	{
		this.licenseNumber = licenseNumber;
	}
}
