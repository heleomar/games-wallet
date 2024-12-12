package com.games.wallet.application.usecase;

import com.games.wallet.application.domain.Exemplo;
import com.games.wallet.ports.in.IFindExemploByIdPortIn;
import com.games.wallet.ports.in.IUpdateExemploPortIn;
import com.games.wallet.ports.out.IFindAddressByZipCodePortOut;
import com.games.wallet.ports.out.IUpdateExemploPortOut;

public class UpdateExemploUseCase implements IUpdateExemploPortIn {

	private final IFindExemploByIdPortIn findExemploByIdPortIn;
	private final IFindAddressByZipCodePortOut findAddressByZipCodePortOut;
	private final IUpdateExemploPortOut updateExemploPortOut;

	/**
	 * @param findExemploByIdPortIn
	 * @param findAddressByZipCodePortOut
	 * @param updateExemploPortOut
	 */
	public UpdateExemploUseCase(IFindExemploByIdPortIn findExemploByIdPortIn,
			IFindAddressByZipCodePortOut findAddressByZipCodePortOut, IUpdateExemploPortOut updateExemploPortOut) {
		this.findExemploByIdPortIn = findExemploByIdPortIn;
		this.findAddressByZipCodePortOut = findAddressByZipCodePortOut;
		this.updateExemploPortOut = updateExemploPortOut;
	}

	@Override
	public void update(Exemplo exemplo, String zipCode) {
		findExemploByIdPortIn.find(exemplo.getId());
		var address = findAddressByZipCodePortOut.find(zipCode);
		exemplo.setAddress(address);

		updateExemploPortOut.update(exemplo);
	}

}
