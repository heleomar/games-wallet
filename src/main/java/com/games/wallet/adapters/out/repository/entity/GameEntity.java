package com.games.wallet.adapters.out.repository.entity;

import java.util.UUID;

import com.games.wallet.shared.enum_model.ModalityTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "GAME")
public class GameEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "GAME_ID")
	private UUID id;

	@Column(name = "GAME_NAME")
	private String name;

	@Column(name = "GAME_MODALITY")
	@Enumerated(EnumType.STRING)
	private ModalityTypeEnum Modality;

}
