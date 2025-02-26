package com.lpu.unit4.lambdaExp;

// Functional Interface
interface MyFunctionalInterface {
    void show();
}

public class WithoutLambdaExample {
    public static void main(String[] args) {
        MyFunctionalInterface obj = new MyFunctionalInterface() {
            @Override public void show() {
                System.out.println("Hello from Anonymous Class!");
            }

        };
        obj.show();
    }
}

