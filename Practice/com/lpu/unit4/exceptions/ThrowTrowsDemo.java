package com.lpu.unit4.exceptions;

public class ThrowTrowsDemo{



    public static void bankBalance() throws ArithmeticException{

        throw  new ArithmeticException("hbef");
    }
    public static void withdrawAmount(int amount) throws ArithmeticException{

        int balance = 1000;

        bankBalance();
        if (amount > balance)

            throw new ArithmeticException("Amount is grater than bank balance");
    }
    public static void main(String[] args) throws Exception{

        try {
            withdrawAmount(1500);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
