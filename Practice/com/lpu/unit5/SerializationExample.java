package com.lpu.unit5;

import java.io.*;

// Define a Serializable Class
class Person {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person p1 = new Person("Singh", 25);

        // Serialize Object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(p1);
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize Object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person p2 = (Person) ois.readObject();
            System.out.println("Object Deserialized Successfully.");
            p2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

