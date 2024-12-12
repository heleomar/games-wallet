package com.games.wallet.adapters.out.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AddressEntity {

	@Column(name = "ADDRESS_STREET")
	private String street;
	@Column(name = "ADDRESS_CITY")
	private String city;
	@Column(name = "ADDRESS_NUMBER")
	private Long number;
	@Column(name = "ADDRESS_STATE")
	private String state;
	@Column(name = "ADDRESS_CEP")
	private String cep;
	@Column(name = "ADDRESS_COUNTRY")
	private String country;
}
