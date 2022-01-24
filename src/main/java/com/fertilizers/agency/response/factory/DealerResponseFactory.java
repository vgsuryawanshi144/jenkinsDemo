package com.fertilizers.agency.response.factory;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.fertilizers.agency.entity.Dealer;
import com.fertilizers.agency.respons.DealerResponse;
import com.fertilizers.agency.respons.IDealerResponse;
import com.fertilizers.agency.respons.Status;

@Service
public class DealerResponseFactory
{
	public IDealerResponse getResponseByAddress(Optional<Dealer> dealer)
	{

		DealerResponse dealerResponse = new DealerResponse();
		if (dealer != null && !dealer.isPresent())
		{
			dealerResponse.setStatus_code("200");
			dealerResponse.setMessage("Success");
			dealerResponse.setData(dealer);
		} else
		{
			dealerResponse.setStatus_code("404");
			dealerResponse.setMessage("Required Data Not Found");
			dealerResponse.setData(dealer);
		}
		return dealerResponse;
	}

	public IDealerResponse deleteById(long id)
	{
		DealerResponse dealerResponse = new DealerResponse();	
		System.out.println("Deleted Successfully" + id);
		return dealerResponse;

	}

	public IDealerResponse save(Dealer dealer)
	{
		DealerResponse dealerResponse = new DealerResponse();
		if (dealer == null)
		{
			dealerResponse.setStatus_code("404");
			dealerResponse.setMessage("Please Add correct Data");
			dealerResponse.setData(dealer);
		} else
		{
			dealerResponse.setStatus_code("200");
			dealerResponse.setMessage("Added Successfully");
			dealerResponse.setData(dealer);
		}
		return dealerResponse;

	}

	public IDealerResponse update(Dealer dealer)
	{
		DealerResponse dealerResponse = new DealerResponse();		
		if (dealer == null)
		{
			dealerResponse.setStatus_code("404");
			dealerResponse.setMessage("Please Add correct Data");
			dealerResponse.setData(dealer);
		} else
		{
			dealerResponse.setStatus_code("200");
			dealerResponse.setMessage("Added Successfully");
			dealerResponse.setData(dealer);
		}
		return dealerResponse;
	}

}
