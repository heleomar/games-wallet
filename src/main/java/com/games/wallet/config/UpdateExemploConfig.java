package com.games.wallet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.games.wallet.adapters.out.FindAddressByZipCodeAdapterOut;
import com.games.wallet.adapters.out.UpdateExemploAdapterOut;
import com.games.wallet.application.usecase.FindExemploByIdUseCase;
import com.games.wallet.application.usecase.UpdateExemploUseCase;

@Configuration
public class UpdateExemploConfig {

	@Bean
	public UpdateExemploUseCase updateExemploUseCase(
			FindExemploByIdUseCase findExemploByIdUseCase, // nesse caso temos que usar o UseCase por conta da porta de
															// entrada
			FindAddressByZipCodeAdapterOut findAddressByZipCodeAdapterOut,
			UpdateExemploAdapterOut updateExemploAdapterOut) {
		return new UpdateExemploUseCase(findExemploByIdUseCase, findAddressByZipCodeAdapterOut,
				updateExemploAdapterOut);
	}

}
