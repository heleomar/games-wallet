package com.games.wallet.adapters.out.repository.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "WALLET")
public class WalletEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "WALLET_ID")
	private UUID id;

	@Column(name = "WALLET_AMOUNT")
	private BigDecimal amount;

	@Column(name = "WALLET_WITHDRAWAL_AMOUNT")
	private BigDecimal withdrawalAmount;

	@Column(name = "WALLET_BLOCKED_AMOUNT")
	private BigDecimal blockedAmount;

	@Column(name = "WALLET_BONUS")
	private BigDecimal bonus;

	@OneToOne
	@JoinColumn(name = "WALLET_PLAYER")
	private PlayerEntity player;

}
