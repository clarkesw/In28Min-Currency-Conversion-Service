package com.clarke.service.beans;

import java.math.BigDecimal;


public class CurrencyConversion {
    private int id;
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalcAmount;
    private String environment;  

    public CurrencyConversion() {}
    
    public CurrencyConversion(CurrencyConversion conv) {
        this.id = conv.getId();
        this.fromCurrency = conv.getFromCurrency();
        this.toCurrency = conv.getToCurrency();
        this.quantity = conv.getQuantity();
        this.conversionMultiple = conv.getConversionMultiple();
        this.totalCalcAmount = conv.getTotalCalcAmount();
        this.environment = conv.getEnvironment();
    }

    public CurrencyConversion(int id, String fromCurrency, String toCurrency, BigDecimal quantity, 
                BigDecimal conversionMultiple, BigDecimal totalCalcAmount, String environment) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.totalCalcAmount = totalCalcAmount;
        this.environment = environment;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getTotalCalcAmount() {
        return totalCalcAmount;
    }

    public void setTotalCalcAmount(BigDecimal totalCalcAmount) {
        this.totalCalcAmount = totalCalcAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    
    
}
