package com.games.wallet.adapters.out.repository.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EXEMPLO")
public class ExemploEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "EXEMPLO_ID")
	private UUID id;

	@Column(name = "EXEMPLO_NAME")
	private String name;

	@Column(name = "EXEMPLO_CPF")
	private String cpf;

	@Embedded
	@Column(name = "EXEMPLO_ADDRESS")
	private AddressEntity address;

	@Column(name = "EXEMPLO_IS_VALID_CPF")
	private Boolean isValidCpf;

	@Column(name = "EXEMPLO_CREATED_AT")
	private LocalDate createdAt;

}
