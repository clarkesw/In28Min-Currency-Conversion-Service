package com.clarke.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CurrencyConversionApp {
    
    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionApp.class, args);
    }
}
