package com.lpu.unit4.exceptions;

public class AssertionExample {
    public static void main(String[] args){
        int age = 15;

//      1.
//        if(age < 18){
//            System.out.println("Age must be at least 18");
//        }

//       2. Exception
//        if (age < 18){
//            throw new CustomException("Age must be at least 18");
//        }

age = 20;

//        3. Assertions
        assert age >= 18 : "Age must be at least 18";
        System.out.println("Age is " + age);



    }

    public void discount(double cartTotal){

        assert cartTotal >= 100: "minimum cart value must be 100 to apply discount";


    }
}

//java -ea AssertionExample

//Exception in thread "main" java.lang.AssertionError: Age must be at least 18

//Age is 15