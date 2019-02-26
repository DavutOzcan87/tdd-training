package com.accenture.training.tdd.exchangecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class ExchangeCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeCalculatorApplication.class, args);
	}

}
