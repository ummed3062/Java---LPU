//package com.lpu.unit3;
//
//// Parent Class 1
//class A {
//    void show() {
//        System.out.println("A's show method");
//    }
//}
//
//// Parent Class 2
//class B {
//    void show() {
//        System.out.println("B's show method");
//    }
//}
//
//// Child Class trying to inherit both A and B (Not Allowed in Java)
//class C extends A, B { // ❌ ERROR: Java does not support multiple class inheritance
//
//
//
//    public static void main(String[] args) {
//        C obj = new C();
//        obj.show(); // ❓ Ambiguity: Which show() method to call? A's or B's?
//    }
//}
//
