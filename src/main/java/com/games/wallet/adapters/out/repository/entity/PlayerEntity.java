package com.games.wallet.adapters.out.repository.entity;

import java.time.LocalDate;
import java.util.UUID;

import com.games.wallet.shared.enum_model.GenderEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PLAYER")
public class PlayerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "PLAYER_ID")
	private UUID id;

	@Column(name = "PLAYER_NAME")
	private String name;

	@Column(name = "PLAYER_USERNAME")
	private String userName;

	@Column(name = "PLAYER_EMAIL")
	private String email;

	@Column(name = "PLAYER_CPF")
	private String cpf;

	@Column(name = "PLAYER_CELL")
	private String cell;

	@Column(name = "PLAYER_GENDER")
	@Enumerated(EnumType.STRING)
	private GenderEnum gender;

	@Column(name = "PLAYER_DATE_BIRTH")
	private LocalDate dateBirth;

	@Embedded
	@Column(name = "PLAYER_ADDRESS")
	private AddressEntity address;

	@Setter(AccessLevel.NONE)
	@Column(name = "PLAYER_CREATED_AT", updatable = false)
	private LocalDate createdAt = LocalDate.now();

}
