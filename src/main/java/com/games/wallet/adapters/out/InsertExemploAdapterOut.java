package com.games.wallet.adapters.out;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.games.wallet.adapters.out.repository.IExemploRepository;
import com.games.wallet.adapters.out.repository.entity.ExemploEntity;
import com.games.wallet.application.domain.Exemplo;
import com.games.wallet.ports.out.IInsertExemploPortOut;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class InsertExemploAdapterOut implements IInsertExemploPortOut {

	private final IExemploRepository exemploRepository;
	private final ModelMapper mapper;

	@Override
	public void insert(Exemplo exemplo) {
		var responseEntity = mapper.map(exemplo, ExemploEntity.class);
		exemploRepository.save(responseEntity);
	}

}
