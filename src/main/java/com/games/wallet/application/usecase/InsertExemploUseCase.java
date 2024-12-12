package com.games.wallet.application.usecase;

import com.games.wallet.application.domain.Exemplo;
import com.games.wallet.ports.in.IInsertExemploPortIn;
import com.games.wallet.ports.out.IFindAddressByZipCodePortOut;
import com.games.wallet.ports.out.IInsertExemploPortOut;

public class InsertExemploUseCase implements IInsertExemploPortIn {

	private final IFindAddressByZipCodePortOut findAddressByZipCodePort;
	private final IInsertExemploPortOut insertExemploPortOut;

	/**
	 * @param findAddressByZipCodePort
	 * @param insertExemploPortOut
	 */
	public InsertExemploUseCase(IFindAddressByZipCodePortOut findAddressByZipCodePort,
			IInsertExemploPortOut insertExemploPortOut) {
		this.findAddressByZipCodePort = findAddressByZipCodePort;
		this.insertExemploPortOut = insertExemploPortOut;
	}

	@Override
	public void insert(Exemplo exemplo, String zipCode) {
		var address = findAddressByZipCodePort.find(zipCode);
		exemplo.setAddress(address);

		insertExemploPortOut.insert(exemplo);
	}

}
