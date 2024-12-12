package com.games.wallet.adapters.in.controller;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.wallet.adapters.in.controller.request.PlayerRequest;
import com.games.wallet.application.domain.Player;
import com.games.wallet.ports.in.IInsertPlayerPortIn;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/players")
@RequiredArgsConstructor
public class PlayerController {

	private final IInsertPlayerPortIn insertPlayerPortIn;
	private final ModelMapper mapper;

	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody PlayerRequest request) {

		var player = mapper.map(request, Player.class);
		insertPlayerPortIn.insert(player);

		return ResponseEntity.ok().build();

	}

}
