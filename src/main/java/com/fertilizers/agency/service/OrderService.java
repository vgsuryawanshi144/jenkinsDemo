package com.fertilizers.agency.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fertilizers.agency.entity.Customer;
import com.fertilizers.agency.entity.Order;
import com.fertilizers.agency.repo.OrderRepo;

@Service()
public class OrderService
{
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	CustomerService customerService;

	public Optional<Order> getOrderDetailsById(Long id)
	{
		Optional<Order> order = orderRepo.findById(id);
		return order;

	}

	public Order deleteOrderDetailsById(long id)
	{
		orderRepo.deleteById(id);
		return null;
	}
	
	public Order saveOrder(Order order)
	{
		Customer customer = customerService.saveCustomer(order.getCustomer());

		return orderRepo.save(order);
	}
	
	public Order updatdeOrder(Order order)
	{
		return orderRepo.save(order);
	}
}
