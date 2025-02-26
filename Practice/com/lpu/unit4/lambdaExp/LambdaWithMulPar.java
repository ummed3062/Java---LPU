package com.lpu.unit4.lambdaExp;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaWithMulPar {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;

        System.out.println("Sum: " + add.operate(5, 3));
    }
}
