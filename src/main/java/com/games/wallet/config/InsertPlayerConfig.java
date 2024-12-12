package com.games.wallet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.games.wallet.adapters.out.InsertPlayerAdapterOut;
import com.games.wallet.application.usecase.InsertPlayerUseCase;

@Configuration
public class InsertPlayerConfig {

	@Bean
	public InsertPlayerUseCase insertPlayerUseCase(
			InsertPlayerAdapterOut insertPlayerAdapterOut) {
		return new InsertPlayerUseCase(insertPlayerAdapterOut);
	}

}
