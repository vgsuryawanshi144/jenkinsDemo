package com.fertilizers.agency.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fertilizers.agency.entity.Dealer;
import com.fertilizers.agency.entity.Order;

@Repository
public interface DealerRepo extends CrudRepository<Dealer, Long>
{

	Dealer save(Dealer dealer);
	Optional<Dealer> findByDealerAddress(String address);

}
