package com.lpu.unit5.generics;

class DiscountCalculator<T extends Number> {
    private T price;

    public DiscountCalculator(T price) {
        this.price = price;
    }

    public double applyDiscount(double discountPercent) {
        return price.doubleValue() - (price.doubleValue() * discountPercent / 100);
    }
}

public class EcommerceApplication {
    public static void main(String[] args) {
        DiscountCalculator<Integer> product1 = new DiscountCalculator<>(100);
        System.out.println("Discounted Price: ₹" + product1.applyDiscount(10));

        DiscountCalculator<Double> product2 = new DiscountCalculator<>(499.99);
        System.out.println("Discounted Price: ₹" + product2.applyDiscount(15));
    }
}
