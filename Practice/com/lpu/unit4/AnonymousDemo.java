package com.lpu.unit4;

interface Greeting {
    void sayHello();
}

//class Child implements Greeting{
//
//    @Override
//    public void sayHello() {
//
//    }
//}


public class AnonymousDemo {
    public static void main(String[] args) {
        // Anonymous inner class implementing Greeting interface
        Greeting greet = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };

        greet.sayHello();
    }
}

