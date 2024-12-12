package com.games.wallet.adapters.out.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.games.wallet.adapters.out.integration.response.AddressResponse;

@FeignClient(name = "IFindAddressByZipCodeClient", url = "${zipcode.client.address.url}")
public interface IFindAddressByZipCodeClient {

	@GetMapping("/{zipCode}")
	AddressResponse find(@PathVariable("zipCode") String zipCode);

}
