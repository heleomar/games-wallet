package com.games.wallet.ports.in;

import java.util.UUID;

import com.games.wallet.application.domain.Exemplo;

public interface IFindExemploByIdPortIn {

	Exemplo find(UUID id);

}
