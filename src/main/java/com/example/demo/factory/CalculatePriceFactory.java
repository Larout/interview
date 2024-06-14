package com.example.demo.factory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by jay
 * @date 2024/06/14.
 */
public class CalculatePriceFactory {

    //选择计费方式
    public  BigDecimal caculatePrice(String type ,Map<Fruit,BigDecimal> fruitMap){
        if (type == null){
            return null;
        }
        if (type == "one"){
            CalculateOne calculateOne = new CalculateOne();
            BigDecimal bigDecimal = calculateOne.calculatePrice(fruitMap);
            bigDecimal=bigDecimal.setScale(1,RoundingMode.HALF_UP);
            return bigDecimal;

        }
        if (type == "two"){
            CalculateTwo calculateTwo = new CalculateTwo();
            BigDecimal bigDecimal = calculateTwo.calculatePrice(fruitMap);
            bigDecimal=bigDecimal.setScale(1,RoundingMode.HALF_UP);
            return bigDecimal;
        }
        if (type == "three"){
            CalculateThree calculateThree = new CalculateThree();
            BigDecimal bigDecimal = calculateThree.calculatePrice(fruitMap);
            bigDecimal=bigDecimal.setScale(1,RoundingMode.HALF_UP);
            return bigDecimal;
        }
        return null;
    }
}
