package com.nps.iso.service;


import com.nps.iso.domain.Currency;
import com.nps.iso.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CahcedCurrencyService implements CurrencyService {

    static final Map<String, Currency> CACHE = new HashMap<>();

    @Autowired
    CurrencyRepository currencyRepository;

    @Override
    public Collection<Currency> findAll() {
        if(CACHE.isEmpty()){
            initCache();
        }
        return CACHE.values();
    }

    @Override
    public Currency findByAlphabeticCode(String alphabeticCode) {
        if(CACHE.isEmpty()){
            initCache();
        }
        return CACHE.get(alphabeticCode);
    }

    private void initCache(){
        List<Currency> currencies = currencyRepository.findAll();

        currencies.forEach((currency) ->
                CACHE.put(currency.getAlphabeticCode(), currency));
    }
}
