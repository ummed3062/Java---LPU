package com.lpu.unit4.lambdaExp;

//@FunctionalInterface
interface MyFunctionalInt {
    int show(int a, int b);

//    void display(int a);

}

//class FunctionalImpl implements MyFunctionalInt{
//    @Override
//    public void show() {
//
//    }
//}

public class LambdaExample {
    public static void main(String[] args) {
//          1.
//        FunctionalImpl obj = new FunctionalImpl();
//        obj.show();
//          2.
//        MyFunctionalInt obj = new MyFunctionalInt() {
//            @Override
//            public void show() {
//
//            }
//        };
//        obj.show();

//          3.

//        int a = 10;
//        int b = 20;
        MyFunctionalInt obj = (a, b) -> a+b;
        obj.show(10, 20);
    }


//    void di



}


