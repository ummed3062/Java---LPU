package com.singh;

class OuterClass {
    static class StaticInnerClass {
        void display() {
            System.out.println("Static Inner Class called.");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
        inner.display();
    }
}

