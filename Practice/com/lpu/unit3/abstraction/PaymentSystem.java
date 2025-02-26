package com.lpu.unit3.abstraction;

// Abstracting the payment system using an interface
interface PaymentGateway {
    void processPayment(double amount);
}

// Concrete implementations
class CreditCard implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}

class PayPal implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}

class UPI implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of $" + amount);
    }
}

// Main Class
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentGateway payment1 = new CreditCard();
        payment1.processPayment(250.00);

        PaymentGateway payment2 = new PayPal();
        payment2.processPayment(100.50);

        PaymentGateway payment3 = new UPI();
        payment3.processPayment(50.00);
    }
}

