package com.nps.iso.web;

import com.nps.iso.domain.Currency;
import com.nps.iso.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("currency")
public class CurrencyController {

    @Autowired
    CurrencyRepository currencyRepository;

    @RequestMapping("/list")
    Collection<Currency> all(){
        Collection<Currency> currencies = currencyRepository.findAll();
        return currencies;
    }

    @RequestMapping("/get/{alphabeticCode}")
    Currency get(@PathVariable("alphabeticCode") String alphabeticCode){
        return currencyRepository.findByAlphabeticCode(alphabeticCode);
    }
}