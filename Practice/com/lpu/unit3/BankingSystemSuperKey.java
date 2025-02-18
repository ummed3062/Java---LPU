package com.lpu.unit3;

// Parent class: BankAccountSuper
class BankAccountSuper {
    String accountHolder;  // Parent class variable
    double balance;

    // Parent class constructor
    BankAccountSuper(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        System.out.println("BankAccount created for: " + accountHolder);
    }

    // Parent class method
    void displayBalance() {
        System.out.println("BankAccount Balance: $" + balance);
    }
}

// Child class: SavingsAccountSuper
class SavingsAccountSuper extends BankAccountSuper {
    double balance;  // Child class variable (hides parent class variable)
    double interestRate;

    // Child class constructor
    SavingsAccountSuper(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);  // Calls parent class constructor
        this.interestRate = interestRate;
        System.out.println("SavingsAccount created with interest rate: " + interestRate + "%");
    }

    // Overriding parent method
    @Override
    void displayBalance() {
        super.displayBalance();  // Accessing parent method (Method Overriding)
        System.out.println("SavingsAccount Balance: $" + balance);  // Accessing child class variable
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Child class method using super to access parent class variables (when hidden)
    void accessParentBalance() {
        System.out.println("Parent Account Balance (Using super): $" + super.balance);  // Accessing parent class variable
    }

    // Child class method that demonstrates calling super from a method inside the subclass
    void displayAccountDetails() {
        System.out.println("Account Holder: " + super.accountHolder);  // Access parent class variable using super
        super.displayBalance();  // Access parent method using super
    }
}

// Main class to test the implementation
public class BankingSystemSuperKey {
    public static void main(String[] args) {
        // Use case 1: Creating a SavingsAccount object and calling displayBalance (method overriding)
        SavingsAccountSuper mySavings = new SavingsAccountSuper("Ummed Singh", 5000, 3.0);
        mySavings.displayBalance();  // Using super to call the parent method (Method Overriding)

        // Use case 2: Using super to access the parent constructor
        System.out.println("\n--- Creating another Account using parent class constructor directly ---");
        BankAccountSuper anotherAccount = new BankAccountSuper("Yashpal Singh", 3000); // Calling parent constructor directly

        // Use case 3: Using super to access parent class variables when they are hidden by subclass
        System.out.println("\n--- Accessing parent balance from child class ---");
        mySavings.accessParentBalance();  // Using super to access parent class variable
    }
}

