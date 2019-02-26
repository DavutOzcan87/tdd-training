package com.accenture.training.tdd.exchangecalculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExchangeController {

    @Autowired
    ExchangeService exchangeService;

    @GetMapping("/exchanges")
    public double calculateEchangeRate(@RequestParam double amount , @RequestParam String currency){
        return 12.5;
    }


    @GetMapping("/rates")
    public List<ExchangeRate> getRates(){
        return exchangeService.findAll();
    }
}
