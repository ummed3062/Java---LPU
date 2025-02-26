package com.lpu.unit4.lambdaExp;

@FunctionalInterface
interface MyFunctionalInt {
    void show();


}
public class LambdaExample {
    public static void main(String[] args) {
        MyFunctionalInt obj = () -> System.out.println("Hello from Lambda!");
        obj.show();
    }
}


