package com.lpu.revise;

public class UncheckedExceptionPropagationDemo {
    static void method3(){
        System.out.println("method 3");
            int num = 10/0;
        System.out.println("method 3 executed after exception");
    }
    static void method2(){
        System.out.println("method 2");
            method3();
        System.out.println("Method2  executed after the method3");
    }
    static void method1(){
        System.out.println("Method1");
        method2();
        System.out.println("Method1  executed after the method2");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        try {
            method1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main method executed after the method1");
    }
}

//______________________________
//method3{......}
//method2{........}
//method1{.........}
//main{.......}
//______________________________
