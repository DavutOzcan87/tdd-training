package com.accenture.training.tdd.exchangecalculator;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ExchangeRateRepository extends CrudRepository<Long , ExchangeRate> {
}
