package com.lpu.unit3.abstraction;

interface PaymentGatewayDemo {
    void processPayment(double amount);

    // Static method for card validation
    static boolean validateCard(String cardNumber) {
        return cardNumber.matches("\\d{16}"); // Checks if card number is 16 digits
    }

    static boolean validatedPincode(String pinCode){

        return true;
    }


}

class HDFC implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through HDFC: $" + amount);
    }
}

class SBI implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through SBI: $" + amount);
    }
}

// Testing static method
public class PaymentTestStatic {
    public static void main(String[] args) {
        boolean isValid = PaymentGatewayDemo.validateCard("1234567812345678");
        System.out.println("Is card valid? " + isValid);
    }
}

