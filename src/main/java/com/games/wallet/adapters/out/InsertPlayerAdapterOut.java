package com.games.wallet.adapters.out;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.games.wallet.adapters.out.repository.IPlayerRepository;
import com.games.wallet.adapters.out.repository.entity.PlayerEntity;
import com.games.wallet.application.domain.Player;
import com.games.wallet.ports.out.IInsertPlayerPortOut;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class InsertPlayerAdapterOut implements IInsertPlayerPortOut {

	private final IPlayerRepository playerRepository;
	private final ModelMapper mapper;

	@Override
	public void insert(Player player) {
		var playerEntity = mapper.map(player, PlayerEntity.class);
		playerRepository.save(playerEntity);
	}

}
