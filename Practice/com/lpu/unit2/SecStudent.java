package com.lpu.unit2;

public class SecStudent {
    String name;
    // Parameterized Constructor
    public SecStudent(String studentName) {
        name = studentName;
    }
    public static void main(String[] args) {
        SecStudent student1 = new SecStudent("Alice");
// Parameterized constructor is called
        SecStudent student2 = new SecStudent("Bob");
        System.out.println(student1.name); // Output: Alice
        System.out.println(student2.name); // Output: Bob
    }
}
