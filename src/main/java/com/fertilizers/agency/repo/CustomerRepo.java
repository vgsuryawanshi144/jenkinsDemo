package com.fertilizers.agency.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fertilizers.agency.entity.Customer;

@Repository()
public interface CustomerRepo extends CrudRepository<Customer, Long>
{
	List<Customer> findByFirstName(String firstName);
}
