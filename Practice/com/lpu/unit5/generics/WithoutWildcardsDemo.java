package com.lpu.unit5.generics;

import java.util.ArrayList;
import java.util.List;

public class WithoutWildcardsDemo {
    public static void printList(List<Object> list) {  // Accepts only List<Object>
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        printList(list);
    }
}



//    class ClassName<T extends SuperClass> { ... }
