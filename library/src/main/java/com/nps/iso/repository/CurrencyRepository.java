package com.nps.iso.repository;


import com.nps.iso.domain.Currency;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CurrencyRepository extends Repository<Currency, Integer> {

    List<Currency> findAll();

    Currency findByAlphabeticCode(String alphabeticCode);

}
