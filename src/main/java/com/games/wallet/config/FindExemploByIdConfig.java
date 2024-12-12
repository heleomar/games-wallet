package com.games.wallet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.games.wallet.adapters.out.FindExemploByIdAdapterOut;
import com.games.wallet.application.usecase.FindExemploByIdUseCase;

@Configuration
public class FindExemploByIdConfig {

	@Bean
	public FindExemploByIdUseCase findExemploByIdUseCase(
			FindExemploByIdAdapterOut findExemploByIdAdapterOut) {
		return new FindExemploByIdUseCase(findExemploByIdAdapterOut);
	}

}
