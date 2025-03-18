package com.lpu.unit4;


import java.util.Arrays;

class Outer {

    private int num = 10;
    static String outerStaticVar = "Static Variable";


    // Static Nested Class
    static class StaticNested {
        void display() {
            System.out.println("Accessing outer class static variable: " + outerStaticVar);
//            System.out.println(num);
        }
    }

    void display(){

        class LocalInnerDemo{


        }
    }

    class NonStatic{
        void display(){
            System.out.println(num);
        }




    }
}

public class NestedStaticDemo {
    public static void main(String[] args) {
        // Instantiating static nested class without creating outer class object
        Outer.StaticNested nestedObj = new Outer.StaticNested();
        nestedObj.display();

        Outer outer = new Outer();



//        Outer.NonStatic obj1 = new outer.NonStatic();
        Outer.NonStatic obj = outer.new NonStatic();




    }
}
