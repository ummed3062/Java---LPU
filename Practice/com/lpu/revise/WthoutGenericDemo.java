package com.lpu.revise;

import java.util.ArrayList;
import java.util.List;

public class WthoutGenericDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("lpu");
        list.add(5);

        for (Object obj: list){

            String str = (String) obj;
        }

        List<String> list1 = new ArrayList<>();
        list1.add("ByteXL");

        for (String str : list1){

        }




    }
}
