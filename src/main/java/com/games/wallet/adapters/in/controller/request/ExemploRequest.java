package com.games.wallet.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ExemploRequest {

	@NotBlank
	private String name;

	@NotBlank
	private String cpf;

	@NotBlank
	private String zipCode;

}
