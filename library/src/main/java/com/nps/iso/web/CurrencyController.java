package com.nps.iso.web;

import com.nps.iso.api.domain.Currency;
import com.nps.iso.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("currency")
public class CurrencyController {

    @Autowired
    CurrencyRepository currencyRepository;

    @RequestMapping("/list")
    public Collection<Currency> list() {
        Collection<Currency> currencies = currencyRepository.findAll();
        return currencies;
    }

    @RequestMapping("/get/{alphabeticCode}")
    public Currency get(@PathVariable("alphabeticCode") String alphabeticCode) {
        return currencyRepository.findByAlphabeticCode(alphabeticCode);
    }
}