package com.example.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class DemoServerlessApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServerlessApplication.class, args);
	}

	@Bean
	public Function<String, String> saludo() {
		return value -> {
			return "hola " + value;
		};
	}

}
