package com.accenture.training.tdd.exchangecalculator;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "exchange_rate")
public class ExchangeRate {
    @Id
    private long id;

    @Column
    private String currency;
}
