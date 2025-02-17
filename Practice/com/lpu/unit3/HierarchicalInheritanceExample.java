package com.lpu.unit3;

// Parent class
class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

// Child class 1
class Circle extends Shape {
    double radius = 5;
    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

// Child class 2
class Rectangle extends Shape {
    double length = 4, width = 6;
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Main class
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        Rectangle r = new Rectangle();
        r.area();
    }
}

