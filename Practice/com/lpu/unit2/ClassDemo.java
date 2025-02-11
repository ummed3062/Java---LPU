package com.lpu.unit2;


// Outer class
class OuterClass {
    private String outerField = "Outer Field";

    // Static nested class
    static class StaticNestedClass {
        void display() {


            System.out.println("Inside Static Nested Class" );
        }
    }

    // Inner class (non-static)
    class InnerClass {
        void display() {
            System.out.println(outerField);
            System.out.println("Inside Inner Class");
            System.out.println("Accessing outer class field: " + outerField);
        }


    }

    class AnonymousDemo{

        void disply(){

            System.out.println("Hello World");
        }

//        InnerClass obj = new InnerClass(){
//
//            @Override
//            void display() {
//                super.display();
//            }
//        }
    }
}

// Main class to test nested classes
public class ClassDemo {

    public static void main(String[] args) {
        // Accessing Static Nested Class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Accessing Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();


//        OuterClass outer1 = new OuterClass(){
//
//
//
//        }
    }
}





//public class ClassDemo {
//
////    Fields (Attributes)
////    Methods (unctions)
//
//}

//ClassName ObjectName = new ClassName();

//returnType methodName(parameterList){
//    //    method body
//}


