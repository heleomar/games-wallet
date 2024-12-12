package com.games.wallet.application.usecase;

import com.games.wallet.application.domain.Player;
import com.games.wallet.ports.in.IInsertPlayerPortIn;
import com.games.wallet.ports.out.IInsertPlayerPortOut;

public class InsertPlayerUseCase implements IInsertPlayerPortIn {

	private final IInsertPlayerPortOut insertPlayerPortOut;

	/**
	 * @param insertPlayerPortOut
	 */
	public InsertPlayerUseCase(IInsertPlayerPortOut insertPlayerPortOut) {
		this.insertPlayerPortOut = insertPlayerPortOut;
	}

	@Override
	public void insert(Player player) {
		insertPlayerPortOut.insert(player);

	}

}
