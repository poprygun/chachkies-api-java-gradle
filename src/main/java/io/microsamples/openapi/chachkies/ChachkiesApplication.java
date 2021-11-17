package io.microsamples.openapi.chachkies;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChachkiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChachkiesApplication.class, args);
	}

	@Bean
	public Module jsonNullableModule() {
		return new JsonNullableModule();
	}

}