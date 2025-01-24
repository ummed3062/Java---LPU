package com.singh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;




public class WrapperInCollections {
    public static void main(String[] args) {

        int id;
        String name = "Ummed Singh";
        String contact = "987654321";

//        List<Integer> list = new LinkedList<>();


//        int number = contact;




        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new LinkedList<>();

        int[] arr = new int[10];
        arr[0]  =10;
        System.out.println(arr[0]);


        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();

        System.out.println(arr[0]);

        // Adding elements (Autoboxing)

        list.add(userinput);
        list.add(20);
        // Retrieving elements (Unboxing)
        int first = list.get(0);
        System.out.println("List: " + list);
        System.out.println("First Element: " + first);
    }
}

