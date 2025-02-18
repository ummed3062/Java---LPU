package com.lpu.unit3;

// Interface 1
interface A {
    default void show() {
        System.out.println("A's show method");
    }

}

// Interface 2
interface B {
    default void show() {
        System.out.println("B's show method");
    }
}

// Class implementing both interfaces
class C implements A, B {
    // Overriding show() method to resolve ambiguity
    @Override
    public void show() {
        System.out.println("Resolving ambiguity...");
        A.super.show(); // Explicitly calling A's show()
        B.super.show(); // Explicitly calling B's show()
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

