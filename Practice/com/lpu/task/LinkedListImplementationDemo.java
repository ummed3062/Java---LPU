package com.lpu.task;

public class LinkedListImplementationDemo {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
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

class CustomLinkedList<E> {
    private Node<E> head; // First node (start of the list)
    private Node<E> tail; // Last node (end of the list)
    private int size = 0; // Tracks number of elements

    // Node class
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    // Add element at the end
    public void add(E e) {
        Node<E> newNode = new Node<>(tail, e, null);
        if (tail == null) { // If list is empty, new node becomes head and tail
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    // Get element by index
    public E get(int index) {
        checkIndex(index);
        Node<E> current = getNode(index);
        return current.item;
    }

    // Remove element by index
    public void remove(int index) {
        checkIndex(index);
        Node<E> nodeToRemove = getNode(index);

        if (nodeToRemove.prev != null) {
            nodeToRemove.prev.next = nodeToRemove.next;
        } else {
            head = nodeToRemove.next;
        }

        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = nodeToRemove.prev;
        } else {
            tail = nodeToRemove.prev;
        }

        size--;
    }

    // Get Node by index (used in get() and remove())
    private Node<E> getNode(int index) {
        Node<E> current;
        if (index < size / 2) { // Traverse from head
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else { // Traverse from tail
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    // Check if index is valid
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Get size of the list
    public int size() {
        return size;
    }

    // Display elements
    public void display() {
        Node<E> current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.item + (current.next != null ? ", " : ""));
            current = current.next;
        }
        System.out.println("]");
    }


}

