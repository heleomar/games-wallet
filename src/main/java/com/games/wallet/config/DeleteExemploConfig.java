package com.games.wallet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.games.wallet.adapters.out.DeleteByIdAdapterOut;
import com.games.wallet.application.usecase.DeleteExemploByIdUseCase;
import com.games.wallet.application.usecase.FindExemploByIdUseCase;

@Configuration
public class DeleteExemploConfig {

	@Bean
	public DeleteExemploByIdUseCase deleteExemploByIdUseCase(
			FindExemploByIdUseCase findExemploByIdUseCase,
			DeleteByIdAdapterOut deleteByIdAdapterOut) {
		return new DeleteExemploByIdUseCase(findExemploByIdUseCase, deleteByIdAdapterOut);
	}

}
