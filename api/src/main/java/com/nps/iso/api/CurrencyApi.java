package com.nps.iso.api;

import com.nps.iso.api.domain.Currency;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public interface CurrencyApi {

    Collection<Currency> list();

    Currency get(@PathVariable("alphabeticCode") String alphabeticCode);
}
