package com.lpu.revise.unit3;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void displayPersonInfo() {
        System.out.println("Name: " + name);
    }
}
// Child class inheriting from Person
class Student extends Person {
    int rollNumber;
    Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }
    void displayStudentInfo() {
        displayPersonInfo(); // Calling parent class method
        System.out.println("Roll Number: " + rollNumber);
    }
}
// Grandchild class inheriting from Student
class EngineeringStudent extends Student {
    String specialization;
    EngineeringStudent(String name, int rollNumber, String specialization) {
        super(name, rollNumber);
        this.specialization = specialization;
    }
    void displayEngineeringStudentInfo() {
        displayStudentInfo(); // Calling student class method
        System.out.println("Specialization: " + specialization);
    }
}
// Main class to test the hierarchy
public class EducationSystem {
    public static void main(String[] args) {
        EngineeringStudent engStudent = new EngineeringStudent("Ummed Singh", 1001, "Computer Science");
        engStudent.displayEngineeringStudentInfo();
    }
}
