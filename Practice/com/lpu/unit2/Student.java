package com.lpu.unit2;

public class Student {
    String name;
    // Default Constructor
    public Student() {
        name = "Unknown"; // Setting default value
    }
    public static void main(String[] args) {
        Student student = new Student();
// Default constructor is called
        System.out.println(student.name); // Output: Unknown
    }
}
