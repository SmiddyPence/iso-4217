package com.nps.iso.service;

import com.nps.iso.domain.Currency;

import java.util.Collection;

public interface CurrencyService {

    Collection<Currency> findAll();

    Currency findByAlphabeticCode(String alphabeticCode);

}
