package com.games.wallet.application.usecase;

import java.util.UUID;

import com.games.wallet.ports.in.IDeleteExemploByIdPortIn;
import com.games.wallet.ports.in.IFindExemploByIdPortIn;
import com.games.wallet.ports.out.IDeleteExemploByIdPortOut;

public class DeleteExemploByIdUseCase implements IDeleteExemploByIdPortIn {

	private final IFindExemploByIdPortIn findExemploByIdPortIn;
	private final IDeleteExemploByIdPortOut deleteExemploByIdPortOut;

	/**
	 * @param findExemploByIdPortIn
	 * @param deleteExemploByIdPortOut
	 */
	public DeleteExemploByIdUseCase(IFindExemploByIdPortIn findExemploByIdPortIn,
			IDeleteExemploByIdPortOut deleteExemploByIdPortOut) {
		this.findExemploByIdPortIn = findExemploByIdPortIn;
		this.deleteExemploByIdPortOut = deleteExemploByIdPortOut;
	}

	@Override
	public void delete(UUID Id) {
		findExemploByIdPortIn.find(Id);
		deleteExemploByIdPortOut.delete(Id);
	}

}
