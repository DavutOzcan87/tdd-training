package com.accenture.training.tdd.exchangecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@ComponentScan(basePackages = "com.accenture.training.tdd.exchangecalculator")
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.accenture.training.tdd.exchangecalculator")
@EntityScan(basePackages = "com.accenture.training.tdd.exchangecalculator")
public class ExchangeCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeCalculatorApplication.class, args);
	}

}
