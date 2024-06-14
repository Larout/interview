package com.example.demo;

/**
 * @author by jay
 * @date 2024/06/14.
 */
public class test1 {
    public static int calculatePrice1(int applesWeight, int strawberriesWeight) {
    // 定义苹果和草莓的单价
    int applePriceKg = 8;
    int strawberryPriceKg = 13;

    // 计算总价
    int totalPrice = applesWeight * applePriceKg + strawberriesWeight * strawberryPriceKg;

        return totalPrice;
}

    public static int calculatePrice2(int applesWeight, int strawberriesWeight,int mangoWeight) {
        // 定义苹果和草莓的单价
        int applePriceKg = 8;
        int strawberryPriceKg = 13;
        int mangoPriceKg = 20;

        // 计算总价
        int totalPrice = applesWeight * applePriceKg + strawberriesWeight * strawberryPriceKg + mangoWeight*mangoPriceKg;

        return totalPrice;
    }

    public static double calculatePrice3(int applesWeight, int strawberriesWeight,int mangoWeight) {
        // 定义苹果和草莓的单价
        int applePriceKg = 8;
        int strawberryPriceKg = 13;
        int mangoPriceKg = 20;

        // 计算总价

        double totalPrice = applesWeight * applePriceKg + strawberriesWeight * strawberryPriceKg * 0.8 + mangoWeight* mangoPriceKg;

        return totalPrice;
    }

    public static double calculatePrice4(int applesWeight, int strawberriesWeight,int mangoWeight) {
        // 定义苹果和草莓的单价
        int applePriceKg = 8;
        int strawberryPriceKg = 13;
        int mangoPriceKg = 20;

        // 计算总价

        double totalPrice = applesWeight * applePriceKg + strawberriesWeight * strawberryPriceKg * 0.8 + mangoWeight* mangoPriceKg;

        if (totalPrice > 100){
            totalPrice = totalPrice - 10 ;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        // 假设顾客 A 购买了3斤苹果和2斤草莓
        int total1 = calculatePrice1(3, 2);
        System.out.println("顾客A购买水果的总价格为：" + total1 + "元");

        //假设顾客 B 购买了4斤苹果和5斤草莓和3斤芒果
        int total2 = calculatePrice2(4, 5,3);
        System.out.println("顾客B购买水果的总价格为：" + total2 + "元");

        //假设顾客 C 购买了4斤苹果和5斤草莓和3斤芒果
        double total3 = calculatePrice3(4, 5,3);
        System.out.println("顾客C购买水果的总价格为：" + total3 + "元");

        //假设顾客 D 购买了4斤苹果和5斤草莓和3斤芒果
        double total4 = calculatePrice4(4, 5,3);
        System.out.println("顾客D购买水果的总价格为：" + total4 + "元");
    }
}
