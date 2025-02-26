package com.lpu.unit3.abstraction;

interface DiscountService {
    // Default method providing a common discount calculation
    default double calculateDiscount(double price) {
        return price * 0.10; // Default 10% discount
    }

}

class Pnb implements DiscountService {
    // Uses default discount calculation
}

class Icici implements DiscountService {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.15; // ICICI gives a 15% discount
    }
}


public class DiscountTestDefault {
    public static void main(String[] args) {
        DiscountService pnb = new Pnb();
        DiscountService icici = new Icici();

        System.out.println("PNB Discounted Price: $" + pnb.calculateDiscount(100));
        System.out.println("ICICI Discounted Price: $" + icici.calculateDiscount(100));
    }
}

