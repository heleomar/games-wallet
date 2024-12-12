package com.games.wallet.adapters.in.controller.response;

import lombok.Data;

@Data
public class ExemploResponse {

	private String name;
	private AddressResponse address;
	private String cpf;
	private Boolean isValidCpf;

}
