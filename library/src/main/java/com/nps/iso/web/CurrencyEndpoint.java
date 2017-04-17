package com.nps.iso.web;

import com.nps.iso.api.CurrencyApi;
import com.nps.iso.domain.Currency;
import com.nps.iso.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

@Component
public class CurrencyEndpoint implements CurrencyApi {

    @Autowired
    CurrencyRepository currencyRepository;

    public Response list() {
        Collection<Currency> currencies = currencyRepository.findAll();
        return Response.ok(currencies, MediaType.APPLICATION_JSON_TYPE).build();
    }

    public Response get(String code) {
        Currency currency = currencyRepository.findByAlphabeticCode(code);
        return Response.ok(currency, MediaType.APPLICATION_JSON_TYPE).build();
    }
}