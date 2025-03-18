package com.lpu.unit4.exceptions;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        assert balance >= 0 : "Balance cannot be negative";
        this.balance = balance;
    }

    public void withdraw(int amount) {
        assert amount > 0 : "Withdrawal amount must be positive";
        assert balance >= amount : "Insufficient balance";
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.withdraw(150); // This will trigger an AssertionError
    }
}


