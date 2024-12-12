package com.games.wallet.ports.out;

import java.util.Optional;
import java.util.UUID;

import com.games.wallet.application.domain.Exemplo;

public interface IFindExemploByIdPortOut {

	Optional<Exemplo> find(UUID id);

}
