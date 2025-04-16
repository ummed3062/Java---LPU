package com.lpu.revise.unit2;

public class TypesOFClassesDemo {

    public static void main(String[] args) {

//        AbstractClass obj = new AbstractClass();
        ConcreteClass obj1 = new ConcreteClass();

        WithoutAnonymousDemo withoutObj = new WithoutAnonymousDemo();
        withoutObj.display();



        LPUInterface lpuInterObj = new LPUInterface() {
            @Override
            public void display() {

            }
        };
        lpuInterObj.display();
        lpuInterObj.display();



    }
}

interface LPUInterface{
    void display();
}

class WithoutAnonymousDemo implements LPUInterface{

    @Override
    public void display() {

    }
}


class OuterClass{
    int a = 10;

    int outerMethod(){

        return 19;
    }

    class InnerNormalClass{
        void display(){
            System.out.println(a);
            outerMethod();
        }
    }

    static class InnerStaticClass{
        void display(){
//            System.out.println(a);
//            outerMethod();
        }
    }
}


abstract class AbstractClass{
    abstract void basicDetails();
    void display(){

    }
}

interface InterFaceDemo{
    void basicDetails();
    default void display(){

    }
}

class ConcreteClass{

    void details(){

    }
}
