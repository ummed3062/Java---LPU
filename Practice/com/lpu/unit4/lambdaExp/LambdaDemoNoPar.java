package com.lpu.unit4.lambdaExp;

@FunctionalInterface
interface Greetings {
    void sayHello();
}

public class LambdaDemoNoPar {
    public static void main(String[] args) {
        Greetings g = () -> System.out.println("Hello, Lambda!");
        g.sayHello();
    }
}

