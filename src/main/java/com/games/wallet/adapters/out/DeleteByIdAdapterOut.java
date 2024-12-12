package com.games.wallet.adapters.out;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.games.wallet.adapters.out.repository.IExemploRepository;
import com.games.wallet.ports.out.IDeleteExemploByIdPortOut;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DeleteByIdAdapterOut implements IDeleteExemploByIdPortOut {

	private final IExemploRepository exemploRepository;

	@Override
	public void delete(UUID id) {
		exemploRepository.deleteById(id);
	}

}
