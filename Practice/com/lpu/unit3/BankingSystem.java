package com.lpu.unit3;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
}

// Child class inheriting from BankAccount
class SavingsAccount extends BankAccount {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// Main class to test the implementation
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("Ummed Singh", 500.0);
        myAccount.deposit(200);
        myAccount.withdraw(100);
        myAccount.withdraw(700);
    }
}

