package com.nps.iso.web;

import com.nps.iso.domain.Currency;
import com.nps.iso.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CurrencyController {

    @Autowired
    CurrencyRepository currencyRepository;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/currency/all")
    @ResponseBody
    List<Currency> all(){
        List<Currency> currencies = currencyRepository.findAll();
        return currencies;
    }

    @RequestMapping("/currency/{alphabeticCode}")
    @ResponseBody
    Currency all(@PathVariable("alphabeticCode") String alphabeticCode){
        return currencyRepository.findByAlphabeticCode(alphabeticCode);
    }
}