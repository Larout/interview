package com.example.demo.factory;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author by jay
 * @date 2024/06/14.
 */
/*工厂模式*/
public class CalculateOne implements CalculatePrice{
    @Override
    public BigDecimal calculatePrice(Map<Fruit, BigDecimal> buyFruits) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Map.Entry<Fruit, BigDecimal> fruitEntry : buyFruits.entrySet()) {
            Fruit fruit = fruitEntry.getKey();
            totalPrice = fruit.getPrice().multiply(fruitEntry.getValue()).add(totalPrice);
        }
        return totalPrice;
    }
}
