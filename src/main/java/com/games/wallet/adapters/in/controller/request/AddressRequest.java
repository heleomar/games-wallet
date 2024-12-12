package com.games.wallet.adapters.in.controller.request;

import lombok.Data;

@Data
public class AddressRequest {

	private String street;
	private String city;
	private Long number;
	private String state;
	private String cep;
	private String country;

}
