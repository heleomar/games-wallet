package com.games.wallet.shared.enum_model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionTypeEnum {

	BET(0L, "Aposta"),
	GAYN(1L, "Ganho"),
	DEPOSIT(2L, "Deposito"),
	WITHDRAW(3L, "Saque"),
	BONUS(4L, "Bônus"),
	OUTRO(5L, "Outro");

	private Long id;
	private String descricao;

	public static TransactionTypeEnum getById(Long id) {
		return Arrays.asList(values()).stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
	}
}
