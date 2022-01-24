package com.fertilizers.agency.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fertilizers.agency.entity.Customer;
import com.fertilizers.agency.entity.Order;
import com.fertilizers.agency.request.OrderRequest;
import com.fertilizers.agency.respons.IOrderResponse;
import com.fertilizers.agency.response.factory.ConvertToCustomer;
import com.fertilizers.agency.response.factory.ConvertToOrder;
import com.fertilizers.agency.response.factory.OrderResponseFactory;
import com.fertilizers.agency.service.CustomerService;
import com.fertilizers.agency.service.OrderService;

@RestController()
@RequestMapping("/order")
public class OrderController
{
	@Autowired
	OrderService orderService;

	@Autowired
	OrderResponseFactory orderResponse;
	
	@Autowired
	ConvertToOrder convertToOrder;

	@GetMapping("/{id}")
	public IOrderResponse get(@PathVariable long id)
	{
		Optional<Order> order = orderService.getOrderDetailsById(id);
		IOrderResponse iOrderResponse = orderResponse.getResponseById(order);
		return iOrderResponse;
	}

	@PostMapping()
	public IOrderResponse save(@RequestBody OrderRequest orderRequest)
	{
		Order order = convertToOrder.orderDetails(orderRequest);
		orderService.saveOrder(order);
		IOrderResponse iOrderResponse = orderResponse.save(order);
		return iOrderResponse;
	}

	@PatchMapping()
	public IOrderResponse update(@RequestBody Order order)
	{
		orderService.saveOrder(order);
		IOrderResponse iOrderResponse = orderResponse.save(order);
		return iOrderResponse;
	}


	@DeleteMapping("/{id}")
	public IOrderResponse delete(@PathVariable long id)
	{
		Order order = orderService.deleteOrderDetailsById(id);
		IOrderResponse iOrderResponse = orderResponse.deleteById(id);
		return iOrderResponse;
	}
}
