package com.lpu.unit5.generics;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenericDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");
        list.add(new Integer(5)); //OK

        for(Object obj : list){
            //type casting leading to ClassCastException at runtime
            String str=(String) obj;
        }

        List<String> list1 = new ArrayList<String>(); // java 7 ? List<String> list1 = new ArrayList<>();
        list1.add("abc");
//list1.add(new Integer(5)); //compiler error

        for(String str : list1){
            //no type casting needed, avoids ClassCastException
        }


    }
}
