package com.accenture.training.tdd.exchangecalculator;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface ExchangeRateRepository extends CrudRepository<ExchangeRate , Long> {
    List<ExchangeRate> findAll();
}
