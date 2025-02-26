package com.lpu.unit4.lambdaExp;

class Helper {
    static void displayMessage() {
        System.out.println("Hello, Method Reference!");
    }
}

public class MethodReferences {
    public static void main(String[] args) {
        MyFunctionalInterface ref = Helper::displayMessage;
        ref.show();
    }
}

