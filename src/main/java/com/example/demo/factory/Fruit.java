package com.example.demo.factory;

import java.math.BigDecimal;

/**
 * @author by jay
 * @date 2024/06/14.
 */
public class Fruit {

    private String name;

    private BigDecimal price;

    public Fruit(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
