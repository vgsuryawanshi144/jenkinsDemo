package com.fertilizers.agency.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fertilizers.agency.entity.Dealer;
import com.fertilizers.agency.repo.DealerRepo;

@Service()
public class DealerService
{

	@Autowired
	DealerRepo dealerRepo;

	public Optional<Dealer> getDealerByAddress(String address)
	{
		Optional<Dealer> dealer = dealerRepo.findByDealerAddress(address);
		return dealer;
	}

	public Optional<Dealer> deleteById(long id)
	{
		dealerRepo.deleteById(id);
		return null;

	}

	public Dealer saveDealer(Dealer dealer)
	{
		return dealerRepo.save(dealer);
	}

	public Dealer updateDealer(Dealer dealer)
	{
		return dealerRepo.save(dealer);
	}
}
