package com.games.wallet.adapters.out;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.games.wallet.adapters.out.integration.IFindAddressByZipCodeClient;
import com.games.wallet.application.domain.Address;
import com.games.wallet.ports.out.IFindAddressByZipCodePortOut;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeAdapterOut implements IFindAddressByZipCodePortOut {

	private final IFindAddressByZipCodeClient findAddressByZipCodeClient;

	private final ModelMapper mapper;

	@Override
	public Address find(String zipCode) {
		var addressResponse = findAddressByZipCodeClient.find(zipCode);
		return mapper.map(addressResponse, Address.class);
	}

}