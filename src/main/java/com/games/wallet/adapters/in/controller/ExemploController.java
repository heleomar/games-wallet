package com.games.wallet.adapters.in.controller;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.wallet.adapters.in.controller.request.ExemploRequest;
import com.games.wallet.adapters.in.controller.response.ExemploResponse;
import com.games.wallet.application.domain.Exemplo;
import com.games.wallet.ports.in.IDeleteExemploByIdPortIn;
import com.games.wallet.ports.in.IFindExemploByIdPortIn;
import com.games.wallet.ports.in.IInsertExemploPortIn;
import com.games.wallet.ports.in.IUpdateExemploPortIn;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/exemplos")
@RequiredArgsConstructor
public class ExemploController {

	private final IInsertExemploPortIn insertExemploPortIn;
	private final IFindExemploByIdPortIn findExemploByIdPortIn;
	private final IUpdateExemploPortIn updateExemploPortIn;
	private final IDeleteExemploByIdPortIn deleteExemploByIdPortIn;
	private final ModelMapper mapper;

	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody ExemploRequest exemploRequest) {

		var exemplo = mapper.map(exemploRequest, Exemplo.class);
		insertExemploPortIn.insert(exemplo, exemploRequest.getZipCode());

		return ResponseEntity.ok().build();

	}

	@GetMapping("/{id}")
	public ResponseEntity<ExemploResponse> findById(@PathVariable final UUID id) {

		var exemplo = findExemploByIdPortIn.find(id);
		var exemploResponse = mapper.map(exemplo, ExemploResponse.class);

		return ResponseEntity.ok(exemploResponse);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@PathVariable final UUID id,
			@Valid @RequestBody ExemploRequest exemploRequest) {

		var exemplo = mapper.map(exemploRequest, Exemplo.class);
		exemplo.setId(id);

		updateExemploPortIn.update(exemplo, exemploRequest.getZipCode());

		return ResponseEntity.noContent().build();

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable final UUID id) {

		deleteExemploByIdPortIn.delete(id);

		return ResponseEntity.noContent().build();
	}

}
