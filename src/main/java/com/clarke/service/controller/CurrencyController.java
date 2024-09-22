package com.clarke.service.controller;


import com.clarke.service.beans.CurrencyConversion;
import java.math.BigDecimal;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class CurrencyController {
    
    @GetMapping("/currency-conversion/from/{startCurrency}/to/{endCurrency}/quantity/{quantity}")
    public CurrencyConversion calcCurrencyConversion(
                @PathVariable String startCurrency, 
                @PathVariable String endCurrency,
                @PathVariable BigDecimal quantity){
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http").host("localhost").port(8000)
                .path("/currency-exchange/from/")
                .pathSegment(startCurrency)
                .path("/to/")
                .pathSegment(endCurrency)                
                .build();
        
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CurrencyConversion> response = restTemplate
                        .getForEntity(uriComponents.toUriString(), CurrencyConversion.class);
        
        CurrencyConversion body = response.getBody();
        return new CurrencyConversion(body.getId(), startCurrency, endCurrency, quantity,
                    body.getConversionMultiple(), 
                    quantity.multiply(body.getConversionMultiple()), 
                    body.getEnvironment());
    }
}

// http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10