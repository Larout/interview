package com.example.demo.factory;


import java.math.BigDecimal;
import java.util.Map;

/**
 * @author by jay
 * @date 2024/06/14.
 */
public class CalculateTwo implements CalculatePrice {

    @Override
    public BigDecimal calculatePrice(Map<Fruit, BigDecimal> buyFruits) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Map.Entry<Fruit, BigDecimal> fruitEntry : buyFruits.entrySet()) {
            Fruit fruit = fruitEntry.getKey();
            if (fruit.getName().equals("草莓")){
                totalPrice = fruit.getPrice().multiply(fruitEntry.getValue()).multiply(new BigDecimal(0.8)).add(totalPrice);
            }else {
                totalPrice = fruit.getPrice().multiply(fruitEntry.getValue()).add(totalPrice);
            }

        }
        return totalPrice;
    }
}
