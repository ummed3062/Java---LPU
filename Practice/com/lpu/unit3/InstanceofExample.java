package com.lpu.unit3;

class Animal1 {}

class Animal2{}
class Dog extends Animal1 {}

public class InstanceofExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog instanceof Dog);    // true
        System.out.println(dog instanceof Animal1); // true
        System.out.println(dog instanceof Object); // true


    }
}

