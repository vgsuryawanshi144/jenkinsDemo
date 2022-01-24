package com.fertilizers.agency.response.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fertilizers.agency.entity.Order;
import com.fertilizers.agency.request.OrderRequest;

@Service
public class ConvertToOrder
{
	@Autowired
	ConvertToCustomer convertToCustomer;
	
	public Order orderDetails(OrderRequest orderRequest)
	{
		Order order = new Order();
		order.setCustomer(convertToCustomer.createCustomer(orderRequest.getCustomerDetails()));
		convertToCustomer.createOrder(order, orderRequest);
		System.out.println("order.toString()order.toString()order.toString()order.toString()order.toString() "+order.toString());
		
		
	
		return order;
	}

}
