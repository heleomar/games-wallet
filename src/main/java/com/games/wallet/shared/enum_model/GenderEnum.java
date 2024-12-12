package com.games.wallet.shared.enum_model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderEnum {

	MASCULINO(0L, "Masculino"), FEMININO(1L, "Feminino"), OUTRO(2L, "Outro");

	private Long id;
	private String descricao;

	public static GenderEnum getById(Long id) {
		return Arrays.asList(values()).stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
	}
}
