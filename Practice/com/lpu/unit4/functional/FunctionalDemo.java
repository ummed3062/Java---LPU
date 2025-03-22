package com.lpu.unit4.functional;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(); // Single Abstract Method (SAM)

//    void myMethod1(); // Single Abstract Method (SAM)

    // Default method (Optional)
    default void defaultMethod() {
        System.out.println("Default method in Functional Interface");
    }

    default void defaultMethod1() {
        System.out.println("Default method in Functional Interface");
    }

    // Static method (Optional)
    static void staticMethod() {
        System.out.println("Static method in Functional Interface");
    }
}



public class FunctionalDemo {
    public static void main(String[] args) {



        
        // Using Lambda Expression to implement Functional Interface
        MyFunctionalInterface obj = () -> System.out.println("Implementation using Lambda!");
        obj.myMethod();

        obj.defaultMethod(); // Calling default method
        MyFunctionalInterface.staticMethod(); // Calling static method
    }
}

//Output:
//Implementation using Lambda!
//Default method in Functional Interface
//Static method in Functional Interface


