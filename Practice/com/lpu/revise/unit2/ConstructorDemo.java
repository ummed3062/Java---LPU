package com.lpu.revise.unit2;

public class ConstructorDemo {
    public static void main(String[] args) {
//        ConExample obj1 = new ConExample();
//        ConExample obj =  new ConExample(10);

        ChildConstructor chObj = new ChildConstructor();


    }
}

class ConExample{
    ConExample(){
        this(10);
        System.out.println("Default ConExample Executed");

    }
    ConExample(int a){
        System.out.println("Constructor executed with 1 par");
    }
}

class ChildConstructor extends ConExample{

    ChildConstructor(){
        super();
        System.out.println("ChildConstructor executed");
    }
}
