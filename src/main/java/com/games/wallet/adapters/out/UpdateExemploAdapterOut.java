package com.games.wallet.adapters.out;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.games.wallet.adapters.out.repository.IExemploRepository;
import com.games.wallet.adapters.out.repository.entity.ExemploEntity;
import com.games.wallet.application.domain.Exemplo;
import com.games.wallet.ports.out.IUpdateExemploPortOut;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UpdateExemploAdapterOut implements IUpdateExemploPortOut {

	private final IExemploRepository exemploRepository;
	private final ModelMapper mapper;

	@Override
	public void update(Exemplo exemplo) {
		var exemploEntity = mapper.map(exemplo, ExemploEntity.class);
		exemploRepository.save(exemploEntity);

	}

}
