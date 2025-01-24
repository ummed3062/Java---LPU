package com.singh;

public class Variables {
    // Instance variable/Global
    String name = "Ummed SIngh";
    // Static variable
    static int count = 0;
    public void display() {
// Local variable
        int age = 10;
        count++; // Increment static variable
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Variables demo1 = new Variables();
        demo1.display();
        Variables demo2 = new Variables();
        demo2.display();
    }
}