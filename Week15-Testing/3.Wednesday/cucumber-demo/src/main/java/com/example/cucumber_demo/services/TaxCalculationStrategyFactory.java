package com.example.cucumber_demo.services;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TaxCalculationStrategyFactory {
    private static final Map<String, TaxCalculationStrategy> strategies = new HashMap<>();

    static {
        strategies.put("CA", amount -> amount * 0.075);
        strategies.put("NY", amount -> amount * 0.04);
        strategies.put("TX", amount -> amount * 0.065);
    }

    public TaxCalculationStrategy getStrategy(String state) {
        return strategies.getOrDefault(state, amount -> 0.0);
    }
}
