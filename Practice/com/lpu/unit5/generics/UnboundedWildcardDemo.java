package com.lpu.unit5.generics;

import java.util.Arrays;
import java.util.List;

class Printer {
    public static void printList(List<?> list) {  // Accepts any type of list
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
public class UnboundedWildcardDemo {
        public static void main(String[] args) {
            List<Integer> intList = Arrays.asList(1, 2, 3);
            List<String> strList = Arrays.asList("A", "B", "C");

            Printer.printList(intList);  // Works with Integer List
            Printer.printList(strList);  // Works with String List

    }

}
