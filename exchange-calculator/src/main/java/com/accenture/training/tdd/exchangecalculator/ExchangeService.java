package com.accenture.training.tdd.exchangecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeService {

    @Autowired
    private ExchangeRateRepository repository;


    List<ExchangeRate> findAll(){
        return repository.findAll();
    }

    public double calcuateExchange(double amount, String currency) {
        ExchangeRate er = repository.findByCurrency(currency);
        return amount * er.rate;
    }
}
