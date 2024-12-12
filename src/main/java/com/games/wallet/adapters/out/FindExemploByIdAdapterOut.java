package com.games.wallet.adapters.out;

import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.games.wallet.adapters.out.repository.IExemploRepository;
import com.games.wallet.application.domain.Exemplo;
import com.games.wallet.ports.out.IFindExemploByIdPortOut;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FindExemploByIdAdapterOut implements IFindExemploByIdPortOut {

	private final IExemploRepository exemploRepository;
	private final ModelMapper mapper;

	@Override
	public Optional<Exemplo> find(UUID id) {

		var exemploEntity = exemploRepository.findById(id);
		// esta usando map do Optional
		var exemplo = exemploEntity.map(entity -> mapper.map(entity, Exemplo.class));

		return exemplo;
	}

}
