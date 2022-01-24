package com.fertilizers.agency.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fertilizers.agency.entity.Order;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long>
{

}
