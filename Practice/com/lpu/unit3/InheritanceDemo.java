package com.lpu.unit3;

class Parent{
    String surname = "Singh";

    void display(){
        System.out.println("Executed the Parent class method");
    }
}

class child extends Parent{
    String name = "Ummed ";

    @Override
    public void display(){
        System.out.println(name + surname);
    }
}

class child2 extends Parent{

    String name = "Uday ";

    public void display(){
        System.out.println(name + surname);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        child obj = new child();
        obj.display();

        child2 obj2 = new child2();
        obj2.display();

    }
}
