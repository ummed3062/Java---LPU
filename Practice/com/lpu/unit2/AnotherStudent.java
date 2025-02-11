package com.lpu.unit2;

public class AnotherStudent {
    String name;
    int age;
    // Default Constructor
    public AnotherStudent() {
        this("Unknown", 10); // Calls the two-parameter constructor
//        this("Mohit", 20, 98765432);
    }
    // Parameterized Constructor
    public AnotherStudent(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }


    public AnotherStudent(String studentName, int studentAge, int contact) {
        name = studentName;
        age = studentAge;
    }

    public static void main(String[] args) {
        AnotherStudent s1 = new AnotherStudent();
// Calls the default constructor
        System.out.println(s1.name + + s1.age);
// Output: Unknown 0
    }
}
