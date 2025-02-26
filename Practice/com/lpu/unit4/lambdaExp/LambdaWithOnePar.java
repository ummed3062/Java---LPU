package com.lpu.unit4.lambdaExp;

@FunctionalInterface
interface Printer {
    void print(String message);
}

public class LambdaWithOnePar {
    public static void main(String[] args) {
        Printer p = message -> System.out.println("Message: " + message);
        p.print("Hello, World!");
    }
}
