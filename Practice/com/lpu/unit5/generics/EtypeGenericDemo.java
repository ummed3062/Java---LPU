package com.lpu.unit5.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MyList<E>{
    private List<E> list = new ArrayList<>();
    public void addElement(E element){
        list.add(element);
    }
}

class MyMap<K, V>{



}

public class EtypeGenericDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        MyMap<Integer, Integer> myMap = new MyMap<>();

        MyList<String> strList = new MyList<>();
        strList.addElement("Hello");
    }

}
