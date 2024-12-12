package com.games.wallet.adapters.in.controller.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PlayerRequest {

	private String name;
	private String userName;
	private String email;
	private String cpf;
	private String cell;
	private String gender;
	private LocalDate dateBirth;
	private AddressRequest address;

}
