package com.lpu.task;
import java.util.ArrayList;
import java.util.Arrays;


class CustomArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10; // Default initial size
    private Object[] elements; // Internal array
    private int size = 0; // Tracks the number of elements

    // Constructor: Initializes array with default capacity
    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Method to add an element
    public void add(E e) {
        ensureCapacity(); // Ensure there's enough space
        elements[size++] = e;
    }

    // Method to retrieve an element
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index]; // Type casting from Object to E
    }

    // Method to remove an element by index
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1]; // Shift elements to the left
        }
        elements[size - 1] = null; // Remove last element reference
        size--;
    }

    // Method to ensure capacity for adding elements
    private void ensureCapacity() {
        if (size == elements.length) { // If array is full
            int newCapacity = elements.length + (elements.length / 2); // Increase size by 1.5x
            elements = Arrays.copyOf(elements, newCapacity); // Copy old elements to new array
        }
    }

    // Method to check valid index
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Method to get size of the list
    public int size() {
        return size;
    }

    // Display elements
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }


}
public class ArrayListImplementationDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // Output: [10, 20, 30]

        list.remove(1);
        list.display(); // Output: [10, 30]

        System.out.println("Element at index 1: " + list.get(1)); // Output: 30
        System.out.println("Size: " + list.size()); // Output: 2
    }
}







