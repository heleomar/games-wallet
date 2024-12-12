package com.games.wallet.application.usecase;

import java.util.UUID;

import com.games.wallet.application.domain.Exemplo;
import com.games.wallet.ports.in.IFindExemploByIdPortIn;
import com.games.wallet.ports.out.IFindExemploByIdPortOut;

public class FindExemploByIdUseCase implements IFindExemploByIdPortIn {

	private final IFindExemploByIdPortOut findExemploByIdPortOut;

	/**
	 * @param findExemploByIdPortOut
	 */
	public FindExemploByIdUseCase(IFindExemploByIdPortOut findExemploByIdPortOut) {
		this.findExemploByIdPortOut = findExemploByIdPortOut;
	}

	@Override
	public Exemplo find(UUID id) {
		return findExemploByIdPortOut.find(id)
				.orElseThrow(() -> new RuntimeException("Exemplo NotFound"));

	}

}
