package com.lpu.unit5.generics;


import java.util.ArrayList;
import java.util.List;

class DataStore {
    public static void addNumbers(List<? super Integer> list) {  // Accepts Integer and its superclasses
        list.add(10);
        list.add(20);
//         list.add(3.5);  // Error: Double is not allowed
    }
}
public class LowerBoundedWildcardDemo {
    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        DataStore.addNumbers(num);
        System.out.println(numList);

        List<Object> objList = new ArrayList<>();


    }

}
