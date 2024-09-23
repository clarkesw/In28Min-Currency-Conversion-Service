package com.clarke.service.proxy;

import com.clarke.service.beans.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="currency-exchange")
public interface ExchangeProxy {
    
    @GetMapping("/currency-exchange/from/{startCurrency}/to/{endCurrency}")
    public CurrencyConversion getConversionInfo(
                @PathVariable String startCurrency, 
                @PathVariable String endCurrency);
}
