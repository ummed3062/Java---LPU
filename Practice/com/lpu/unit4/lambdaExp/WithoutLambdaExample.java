package com.lpu.unit4.lambdaExp;

@FunctionalInterface
// Functional Interface
interface MyFunctionalInterface {
    void show();
}

//class Demo implements MyFunctionalInterface{
//
//    @Override
//    public void show() {
//
//    }
//}

public class WithoutLambdaExample {
    public static void main(String[] args) {

//        Demo obj = new Demo();
//        obj.show();

        MyFunctionalInterface obj = new MyFunctionalInterface() {
            @Override public void show() {
                System.out.println("Hello from Anonymous Class!");
            }

        };
        obj.show();
    }
}

