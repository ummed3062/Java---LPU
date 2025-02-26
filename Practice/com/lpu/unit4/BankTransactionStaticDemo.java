package com.lpu.unit4;



class Bank{

    static String bankName = "SBI";

    static class TransactionLogger{
        static void logTransaction(String traDetails){
            System.out.println("Dear Customer, Thx for INB txn of Rs. "+ traDetails+" frm A/c 2095");

        }
    }

    void deposit(double amount){
        System.out.println("Depositing: "+ amount);
        TransactionLogger.logTransaction(" "+amount);
    }

    void withdraw(double amount){
        System.out.println("Withdrawing: "+ amount);
        TransactionLogger.logTransaction(" "+amount);
    }
}
public class BankTransactionStaticDemo {

    public static void main(String[] args) {

        Bank myBank = new Bank();

        myBank.deposit(500);

        myBank.withdraw(1000);
    }

}
