package com.accenture.training.tdd.exchangecalculator;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "exchange_rate")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRate {
    @Id
    private long id;

    @Column
    private String currency;

    double rate;
}
