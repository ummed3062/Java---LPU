package com.lpu.unit4.exceptions;

public class ThrowExample {
    static void validate(int age) throws IllegalArgumentException{
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }
    public static void main(String[] args){
//        try {
            validate(16); // Throws IllegalArgumentException
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        anotherValidate(0);
    }
}

