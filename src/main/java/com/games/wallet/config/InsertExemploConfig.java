package com.games.wallet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.games.wallet.adapters.out.FindAddressByZipCodeAdapterOut;
import com.games.wallet.adapters.out.InsertExemploAdapterOut;
import com.games.wallet.application.usecase.InsertExemploUseCase;

@Configuration
public class InsertExemploConfig {

	@Bean
	public InsertExemploUseCase insertExemploUseCase(
			FindAddressByZipCodeAdapterOut findAddressByZipCodeAdapterOut,
			InsertExemploAdapterOut insertExemploAdapterOut) {
		return new InsertExemploUseCase(findAddressByZipCodeAdapterOut, insertExemploAdapterOut);
	}

}
