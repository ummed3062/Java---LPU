package com.lpu.unit2;

public class StudentLPU {
    String name;
    int age;

    // Constructor with 'this' to differentiate between instance variables and parameters
    public StudentLPU(String name, int age) {
        this.name = name; // Refers to current object's fields
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name:" + this.name + ", Age: " + this.age);
    }

    // Constructor chaining using 'this()'
    public StudentLPU() {
        this("Unknown", 18); // Invokes current class constructor
    }

    // Method chaining using 'this' to return current object
    public StudentLPU setName(String name) {
        this.name = name;
        return this; // Returns the current object
    }

    public static void main(String[] args) {
        StudentLPU student1 = new StudentLPU("Alice", 20); // Using parameterized constructor
        student1.display();
        StudentLPU student2 = new StudentLPU(); // Using constructor chaining
        student2.display();
        student2.setName("Bob").display(); // Method chaining with 'this'
    }
}