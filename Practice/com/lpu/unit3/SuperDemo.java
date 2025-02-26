package com.lpu.unit3;

class ParentSuper {
    String name = "Parent";
    ParentSuper(){
        System.out.println("Executed the ParentClass constructor");
    }
    void display() {
        System.out.println("This is the parent class.");
    }
}

class ChildSuper extends ParentSuper {
    String name = "Child";

    ChildSuper(){
        super(); // must be the first statement in the subclass constructor
        System.out.println("jhdfnh");


    }

    @Override
    void display() {
        System.out.println("This is the child class.");
    }
    void show() {
        System.out.println("Name in Child class: " + name);
        System.out.println("Name in Parent class: " + super.name);
        display();
// Calls Child's display method
        super.display(); // Calls Parent's display method
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        ChildSuper child = new ChildSuper();
        child.show();
    }
}