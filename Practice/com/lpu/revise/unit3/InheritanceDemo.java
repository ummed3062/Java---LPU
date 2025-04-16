package com.lpu.revise.unit3;

public class InheritanceDemo {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.display();
    }
}

class Parent{
    String nameParent = "Parent Class";
}

class Child extends Parent{
    void display(){
        System.out.println(nameParent);
    }
}
