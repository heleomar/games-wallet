package com.games.wallet.ports.out;

import com.games.wallet.application.domain.Address;

public interface IFindAddressByZipCodePortOut {
	Address find(String ZipCode);

}
