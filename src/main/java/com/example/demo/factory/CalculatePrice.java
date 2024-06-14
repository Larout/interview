package com.example.demo.factory;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author by jay
 * @date 2024/06/14.
 */
public interface CalculatePrice {
        BigDecimal calculatePrice(Map<Fruit,BigDecimal> buyFruits);
}
