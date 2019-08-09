package br.com.solutis.treinamento.restAPI.testConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.solutis.treinamento.restAPI.service.TestService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private TestService testService;
	
	@Bean
	public boolean instantiateDatabase() {
		testService.instantiationDatabase();
		return true;
	}

}
