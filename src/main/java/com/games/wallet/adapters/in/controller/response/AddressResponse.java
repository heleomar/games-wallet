package com.games.wallet.adapters.in.controller.response;

import lombok.Data;

@Data
public class AddressResponse {

	private String street;
	private String city;
	private Long number;
	private String state;
	private String cep;
	private String country;

}
