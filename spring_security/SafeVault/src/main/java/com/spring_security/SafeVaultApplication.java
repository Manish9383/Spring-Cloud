package com.spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SafeVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafeVaultApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder returnBCrypt(){
		return new BCryptPasswordEncoder(12);
	}
}
