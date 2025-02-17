package com.lpu.unit3;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

// Derived from Mammal
class Human extends Mammal {
    void speak() {
        System.out.println("Humans can speak.");
    }
}

// Main class
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.walk();
        human.speak();
    }
}

