package com.games.wallet.shared.enum_model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ModalityTypeEnum {

	SPORTY(0L, "Esportiva"),
	CASINO(1L, "Casino"),
	BINGO(2L, "Bingo"),
	LOTTERY(3L, "Loteria"),
	OUTRO(4L, "Outro");

	private Long id;
	private String descricao;

	public static ModalityTypeEnum getById(Long id) {
		return Arrays.asList(values()).stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
	}
}
