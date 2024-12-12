package com.games.wallet.adapters.out.repository.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.games.wallet.shared.enum_model.TransactionTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TRANSACTIONS")
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "TRANSACTIONS_ID")
	private UUID id;

	@Column(name = "TRANSACTIONS_REFERENCED_ID")
	private Long IdReferenced;

	@ManyToOne
	@JoinColumn(name = "PLAYER_ID")
	private PlayerEntity player;

	@ManyToOne
	@JoinColumn(name = "GAME_ID")
	private GameEntity game;

	@Column(name = "TRANSACTIONS_AMOUNT")
	private BigDecimal amount;

	@Column(name = "TRANSACTIONS_TYPE")
	@Enumerated(EnumType.STRING)
	private TransactionTypeEnum transactionType;

	@Column(name = "TRANSACTIONS_STATUS", updatable = false)
	private Boolean status;

	@Setter(AccessLevel.NONE)
	@Column(name = "TRANSACTIONS_CREATED_AT", updatable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

}
