package com.lpu.revise.unit5.generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WithoutWildCardGeneric{
    public void printList(List<Object> list) {  // Accepts only List<Object>
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}

class UnboundedWildCardGeneric{
    public void printList(List<?> list) {  // Accepts any type of List
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}

class UpperBoundedWildCardGeneric{
    public void printList(List<? extends Number> list) {  // Accepts any type of List
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}

class LowerBoundedWildCardGeneric{
    public void printList(List<? super Integer> list) {  // Accepts any type of List
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
public class WildCardGenericsDemo {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Java", "Python"));
        ArrayList<Float> floatList = new ArrayList<>(Arrays.asList(10.4f, 20.2f));
        ArrayList<Object> objList = new ArrayList<>(Arrays.asList(10, "Java"));

//        1. Problem: without wild card
        WithoutWildCardGeneric obj = new WithoutWildCardGeneric();
//        obj.printList(intList);

//        2. Unbounded Wildcard example
        UnboundedWildCardGeneric uWCObj = new UnboundedWildCardGeneric();
        uWCObj.printList(intList);
        uWCObj.printList(strList);
        uWCObj.printList(floatList);

//        3. Upper Bounded WildCard
        UpperBoundedWildCardGeneric upperBWCObj = new UpperBoundedWildCardGeneric();
        upperBWCObj.printList(intList);
//        upperBWCObj.printList(objList);
//        upperBWCObj.printList(strList);

//        4. Lower Bounded WildCard
        LowerBoundedWildCardGeneric lowerBWCObj = new LowerBoundedWildCardGeneric();
        lowerBWCObj.printList(intList);
        lowerBWCObj.printList(objList);
//        lowerBWCObj.printList(strList);
//        lowerBWCObj.printList(floatList);



    }
}
