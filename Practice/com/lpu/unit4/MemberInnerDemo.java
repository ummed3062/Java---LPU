package com.lpu.unit4;


class OuterExample {
    private String message = "Hello from Outer class";


    // Member Inner Class
    class Inner {
        void display() {
            System.out.println("Message from Outer: " + message);
        }
    }
}

public class MemberInnerDemo {
    public static void main(String[] args) {
        // Creating an instance of Outer class
        OuterExample outerObj = new OuterExample();

//        System.out.println(outerObj.message);

        // Creating an instance of Inner class
        OuterExample.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}

