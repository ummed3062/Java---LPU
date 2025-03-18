package com.lpu.unit4.exceptions;

public class BankSystemDemo {

    static void amountWithdraw(int amount) throws IllegalArgumentException{
        int balance = 1000;
        if(balance < amount){
            throw new IllegalArgumentException("balance is less than amount...");
        }
    }
    public static void main(String[] args) throws IllegalArgumentException{

            amountWithdraw(1500);

    }
}
