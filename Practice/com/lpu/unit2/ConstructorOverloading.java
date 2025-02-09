package com.lpu.unit2;

class ThirdStudent {
    String name;
    int age;

    // Default Constructor
    public ThirdStudent() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    public ThirdStudent(String studentName) {
        name = studentName;
        age = 8;
    }

    // Another Parameterized Constructor
    public ThirdStudent(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    public static void main(String[] args) {
        ThirdStudent s1 = new ThirdStudent();
        ThirdStudent s2 = new ThirdStudent("Mohit");
        ThirdStudent s3 = new ThirdStudent("Ashish", 20);
        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);

    }
}
// Default constructor
// Single-parameter constructor
// Two-parameter constructor
// Output: Unknown e
// Output: Alice 0
// Output: Bob 20
