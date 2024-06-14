package com.example.demo.factory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by jay
 * @date 2024/06/14.
 */
public class CalutePriceMain {
    private static Map<Fruit, BigDecimal> getFruit(BigDecimal applesWeight, BigDecimal strawberriesWeight , BigDecimal mangoWeight){

        Fruit fruit1 = new Fruit("草莓",BigDecimal.valueOf(13));
        Fruit fruit2 = new Fruit("芒果",BigDecimal.valueOf(20));
        Fruit fruit3 = new Fruit("苹果",BigDecimal.valueOf(8));

        Map<Fruit,BigDecimal> fruitMap = new HashMap<>();

        //自定义斤数
        fruitMap.put(fruit1,strawberriesWeight);
        fruitMap.put(fruit2,mangoWeight);
        fruitMap.put(fruit3,applesWeight);
        return fruitMap;
    }

    public static void main(String[] args) {
        CalculatePriceFactory calculatePriceFactory = new CalculatePriceFactory();
        BigDecimal price = calculatePriceFactory.caculatePrice("one", getFruit(BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(5)));
        System.out.println("第一种形式一共支付"+price+"元");

        BigDecimal price2 = calculatePriceFactory.caculatePrice("two", getFruit(BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(5)));
        System.out.println("第二种形式一共支付"+price2+"元");

        BigDecimal price3 = calculatePriceFactory.caculatePrice("three", getFruit(BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(5)));
        System.out.println("第三种形式一共支付"+price3+"元");
    }



}
