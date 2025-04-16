package com.lpu.unit6.collections;

import java.util.ArrayList;
import java.util.Arrays;


class CustomArrayList<E>{
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] elements;
    private int size = 0;
    public CustomArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(E ele){
        ensureCapacity();
        elements[size] = ele;
        size++;
    }
    public E get(int index){
        checkIndex(index);
        return (E) elements[index];
    }
//    {10, 20, 30, 40}; -> {10, 30, 40, 40} -> {10, 20, 30, null} size--;
    public void remove(int index){
        checkIndex(index);
        for (int i = index; i<size -1; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
    }

    void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " +size);
        }
    }

    void ensureCapacity(){
        if(size == elements.length){
            int newCapacity = elements.length + (elements.length /2);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    int size(){
        return size;
    }

}
public class ArrayListImplementationDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        CustomArrayList<Integer> cusList = new CustomArrayList<>();
        cusList.add(10);
        cusList.add(20);
        cusList.add(30);

        System.out.println(cusList.size());
        System.out.println(cusList.get(4));
        cusList.remove(1);
        System.out.println(cusList.size());
    }
}
