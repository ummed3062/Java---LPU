package com.lpu.unit3.abstraction;

interface Payment {
    int a = 10;
    void makePayment(); // Abstract method

    default void basicDetails(){
        int contact = 98765;
        String name = "Ummed Singh";
    }

    static void display(){
        System.out.println("static method");
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }


}

class PayPalPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using PayPal.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.makePayment(); // Outputs: Payment made using Credit Card.

        Payment payment2 = new PayPalPayment();
        payment2.makePayment(); // Outputs: Payment made using PayPal.
    }
}

