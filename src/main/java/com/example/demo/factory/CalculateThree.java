package com.example.demo.factory;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author by jay
 * @date 2024/06/14.
 */
public class CalculateThree implements CalculatePrice{
    @Override
    public BigDecimal calculatePrice(Map<Fruit, BigDecimal> buyFruits) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Map.Entry<Fruit, BigDecimal> fruitEntry : buyFruits.entrySet()) {
            Fruit fruit = fruitEntry.getKey();
            totalPrice = fruit.getPrice().multiply(fruitEntry.getValue()).add(totalPrice);
        }
        if (totalPrice.compareTo(BigDecimal.valueOf(100)) > 0){
            totalPrice = totalPrice.subtract(BigDecimal.valueOf(10));
        }
        return totalPrice;
    }
}
