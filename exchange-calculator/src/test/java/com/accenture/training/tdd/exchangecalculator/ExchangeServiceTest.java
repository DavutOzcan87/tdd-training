package com.accenture.training.tdd.exchangecalculator;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ExchangeServiceTest {

    @Mock
    ExchangeRateRepository mockRepository;

    @InjectMocks
    ExchangeService exchangeService;

    @Test
    public void sampleTest() {
        assertThat(true).isTrue();
    }



    @Test
    public void shouldReturnValueTimesRatio(){
        when(mockRepository.findByCurrency("$"))
                .thenReturn(dolar());

        double calculated = exchangeService.calcuateExchange(10.0 , "$");
        assertThat(calculated).isEqualTo(55.0);

    }

    private ExchangeRate dolar() {
        return ExchangeRate
                .builder()
                .currency("$")
                .rate(5.5)
                .build();
    }

}