package com.fertilizers.agency.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fertilizers.agency.entity.Customer;
import com.fertilizers.agency.repo.CustomerRepo;

@Service()
public class CustomerService
{
	@Autowired
	CustomerRepo customerRepo;

	public List<Customer> getCustomerDetails(String firstName)
	{
		List<Customer> customer = customerRepo.findByFirstName(firstName);
		return customer;
	}

	public Customer getCustomerById(long id)
	{
		Customer customer = null;
		Optional<Customer> customer1 = customerRepo.findById(id);
		if (customer1.isPresent())
		{
			customer = customer1.get();
		}
		return customer;
	}

	public Customer deleteById(long id)
	{
		customerRepo.deleteById(id);

		return null;
	}

	public Customer saveCustomer(Customer customer)
	{
		Customer customer2	= customerRepo.save(customer);
		
		return customer2;
	}
}
