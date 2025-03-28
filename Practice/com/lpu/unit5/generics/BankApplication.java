package com.lpu.unit5.generics;

class InterestCalculator<T extends Number> {
    private T principal;

    public InterestCalculator(T principal) {
        this.principal = principal;
    }

    public double calculateInterest(double rate) {
        return principal.doubleValue() * rate / 100;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        InterestCalculator<Integer> savingsAccount = new InterestCalculator<>(5000);
        System.out.println("Interest: ₹" + savingsAccount.calculateInterest(5));

        InterestCalculator<Double> loan = new InterestCalculator<>(12000.75);
        System.out.println("Interest: ₹" + loan.calculateInterest(3.5));

        // Error: String is not allowed
        // InterestCalculator<String> invalid = new InterestCalculator<>("Ten Thousand");
    }
}
