package com.lpu.unit6.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        List<Integer> arryList = new ArrayList<>();
        arryList.add(10);

        List<Integer> vector = new Vector<>();

        Vector<Integer> list = new Vector<>();

        list.add(10);

        vector.add(10);

        System.out.println(vector.get(0));

        System.out.println(vector.contains(11));

        Object[] arr =  vector.toArray();
    }
}
