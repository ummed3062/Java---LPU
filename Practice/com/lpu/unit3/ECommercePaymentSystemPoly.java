package com.lpu.unit3;

import java.util.ArrayList;
import java.util.List;

// Parent class: Payment
abstract class PaymentPoly {
    double amount;

    PaymentPoly(double amount) {
        this.amount = amount;
    }

    abstract void processPayment(); // Abstract method to be implemented by subclasses

    void showAmount() {
        System.out.println("Payment Amount: $" + amount);
    }
}

// Child class: CreditCardPayment
class CreditCardPaymentPoly extends PaymentPoly {
    String cardNumber;

    CreditCardPaymentPoly(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment of $" + amount + " using card: " + cardNumber);
    }
}

// Child class: UPIPayment
class UPIPaymentPoly extends PaymentPoly {
    String upiId;

    UPIPaymentPoly(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI Payment of $" + amount + " using UPI ID: " + upiId);
    }
}



// Main class to test the implementation
public class ECommercePaymentSystemPoly {
    public static void main(String[] args) {
        // Using a list of Payment objects instead of separate object creation
        List<PaymentPoly> payments = new ArrayList<>();
        payments.add(new CreditCardPaymentPoly(100.0, "1234-5678-9876-5432"));
        payments.add(new UPIPaymentPoly(50.0, "ummed@upi"));


        // Processing all payments dynamically using a loop
        for (PaymentPoly payment : payments) {
            payment.processPayment();
        }
    }
}

