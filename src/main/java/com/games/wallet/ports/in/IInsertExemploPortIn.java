package com.games.wallet.ports.in;

import com.games.wallet.application.domain.Exemplo;

public interface IInsertExemploPortIn {

	void insert(Exemplo exemplo, String zipCode);

}
