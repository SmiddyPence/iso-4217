package com.nps.iso.web;

import com.nps.iso.domain.Currency;
import com.nps.iso.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("currency")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @RequestMapping("/list")
    Collection<Currency> all(){
        Collection<Currency> currencies = currencyService.findAll();
        return currencies;
    }

    @RequestMapping("/get/{alphabeticCode}")
    Currency get(@PathVariable("alphabeticCode") String alphabeticCode){
        return currencyService.findByAlphabeticCode(alphabeticCode);
    }
}