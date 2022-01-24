package com.fertilizers.agency.response.factory;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fertilizers.agency.entity.Order;
import com.fertilizers.agency.respons.IOrderResponse;
import com.fertilizers.agency.respons.OrderResponse;
import com.fertilizers.agency.respons.Status;

@Service()
public class OrderResponseFactory
{

	public IOrderResponse getResponse(Optional<Order> order)
	{
		OrderResponse orderResponse = new  OrderResponse();
		if (order != null && !order.isPresent())
		{
			orderResponse.setStatus_code("200");
			orderResponse.setMessage("Success");
			orderResponse.setData(order);
		} else
		{
			orderResponse.setStatus_code("404");
			orderResponse.setMessage("Required Data Not Found");
			orderResponse.setData(order);
		}
		return orderResponse;
	}

	public IOrderResponse getResponseById(Optional<Order> customer)
	{
		OrderResponse orderResponse = new  OrderResponse();
		if (customer != null)
		{
			orderResponse.setStatus_code("200");
			orderResponse.setMessage("Success");
			orderResponse.setData(customer);
		} else
		{
			orderResponse.setStatus_code("404");
			orderResponse.setMessage("Required Data Not Found");
			orderResponse.setData(customer);
		}
		return orderResponse;
	}

	public IOrderResponse deleteById(long id)
	{
		OrderResponse orderResponse = new  OrderResponse();
		System.out.println("Deleted Successfully" + id);
		return orderResponse;

	}

	public IOrderResponse save(Order order)
	{
		OrderResponse orderResponse = new  OrderResponse();
		if (order == null)
		{
			orderResponse.setStatus_code("404");
			orderResponse.setMessage("Please Add correct Data");
			orderResponse.setData(order);
		} else
		{
			orderResponse.setStatus_code("200");
			orderResponse.setMessage("Added Successfully");
			orderResponse.setData(order);
		}
		return orderResponse;

	}

	public IOrderResponse update(Order order)
	{
		OrderResponse orderResponse = new  OrderResponse();
		if (order == null)
		{
			orderResponse.setStatus_code("404");
			orderResponse.setMessage("Please Add correct Data");
			orderResponse.setData(order);
		} else
		{
			orderResponse.setStatus_code("200");
			orderResponse.setMessage("Added Successfully");
			orderResponse.setData(order);
		}
		return orderResponse;
	}

}
