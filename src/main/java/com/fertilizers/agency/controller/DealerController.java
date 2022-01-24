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

import com.fertilizers.agency.entity.Dealer;
import com.fertilizers.agency.respons.IDealerResponse;
import com.fertilizers.agency.response.factory.DealerResponseFactory;
import com.fertilizers.agency.service.DealerService;

@RestController
@RequestMapping("/dealer")
public class DealerController
{
	@Autowired
	DealerService dealerService;

	@Autowired
	DealerResponseFactory dealerResponse;

	@GetMapping("/{address}")
	public IDealerResponse get(@PathVariable String address)
	{
		Optional<Dealer> dealer = dealerService.getDealerByAddress(address);
		IDealerResponse iDealerResponse = dealerResponse.getResponseByAddress(dealer);
		return iDealerResponse;
	}

	@PostMapping()
	public IDealerResponse save(@RequestBody Dealer dealer)
	{
		Dealer dealer2 = dealerService.saveDealer(dealer);
		IDealerResponse iDealerResponse = dealerResponse.save(dealer2);
		return iDealerResponse;
	}

	@PatchMapping()
	public IDealerResponse update(@RequestBody Dealer dealer)
	{
		dealerService.saveDealer(dealer);
		IDealerResponse iDealerResponse = dealerResponse.save(dealer);
		return iDealerResponse;
	}

	@DeleteMapping("/{id}")
	public IDealerResponse delete(@PathVariable long id)
	{
		Optional<Dealer> dealer = dealerService.deleteById(id);
		IDealerResponse iDealerResponse = dealerResponse.deleteById(id);
		return iDealerResponse;
	}
}
