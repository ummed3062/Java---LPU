package com.lpu.revise.unit5.generics;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenericDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");
        list.add(5); //OK


        for(Object obj : list){
            //type casting leading to ClassCastException at runtime
            String str=(String) obj;
//            System.out.println(obj.getClass());
        }


        List<String > genericList = new ArrayList<>();
        genericList.add("Java");
        
    }
}

