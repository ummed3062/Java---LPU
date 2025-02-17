package com.lpu.unit3;

// Parent class
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

// Child class for Credit Card Payment
class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment of $" + amount + " using card " + cardNumber);
    }
}

// Child class for UPI Payment
class UPIPayment extends Payment {
    String upiId;

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI Payment of $" + amount + " using UPI ID " + upiId);
    }
}

// Child class for Wallet Payment
class WalletPayment extends Payment {
    String walletName;

    WalletPayment(double amount, String walletName) {
        super(amount);
        this.walletName = walletName;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Wallet Payment of $" + amount + " using " + walletName + " Wallet");
    }
}

// Main class to test the implementation
public class ECommercePaymentSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment(250.75, "1234-5678-9876-5432");
        creditCard.processPayment();

        Payment upi = new UPIPayment(100.50, "user@upi");
        upi.processPayment();

        Payment wallet = new WalletPayment(75.00, "PayPal");
        wallet.processPayment();
    }
}

