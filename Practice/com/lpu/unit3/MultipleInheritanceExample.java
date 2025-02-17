package com.lpu.unit3;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

// Multiple inheritance through interfaces
class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}

