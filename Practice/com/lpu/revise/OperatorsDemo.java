package com.lpu.revise;

public class OperatorsDemo {
    public static void main(String[] args) {


        String userName = "admin";
        String password = "12345";

        boolean isUsernameCorrect = userName.equals("admin");
        boolean isPasswordCorrect = password.equals("12345");

        if(isUsernameCorrect && isPasswordCorrect){
            System.out.println("Login successfully");
        }else {
            System.out.println("Invalid Credentials");
        }



//        Assignment Operators

        int c= 5;

        c += 5; // c = c+5

        System.out.println(c);


        int balance = 1000;

        balance += 500;
        System.out.println(balance);


        int timer = 5;

        while (timer > 0){
            System.out.println( timer);
            timer--;
        }
        System.out.println("Time's up!");


//        Ternary operator

        int n = 10;

        String f = (n > 5) ? "n is grater than 5" : "n is less than 5";

        System.out.println(f);


        int x = 15, y = 20, z = 10;

        int smallest = (x < y) ? (x < z ? x : z) : (y < z? y : z);
        System.out.println(smallest);


        int number = 3;
        if (number % 2 ==0)
            System.out.println("The number is even.");
            

        else {
            System.out.println("The number is odd");
        }

    }

}
