package com.accenture.training.tdd.exchangecalculator;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ExchangeRate {
    @Id
    private long id;

    @Column
    private String currency;
}
