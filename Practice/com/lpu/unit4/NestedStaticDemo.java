package com.lpu.unit4;


class Outer {
    static String outerStaticVar = "Static Variable";


    // Static Nested Class
    static class StaticNested {
        void display() {
            System.out.println("Accessing outer class static variable: " + outerStaticVar);
        }
    }

    class NonStatic{


    }
}

public class NestedStaticDemo {
    public static void main(String[] args) {
        // Instantiating static nested class without creating outer class object
        Outer.StaticNested nestedObj = new Outer.StaticNested();
        nestedObj.display();


    }
}
