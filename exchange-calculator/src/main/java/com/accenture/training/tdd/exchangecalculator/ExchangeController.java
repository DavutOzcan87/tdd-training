package com.accenture.training.tdd.exchangecalculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {



    @GetMapping("/exchanges")
    public double calculateEchangeRate(@RequestParam double amount , @RequestParam String currency){
        return 12.5;
    }
}
