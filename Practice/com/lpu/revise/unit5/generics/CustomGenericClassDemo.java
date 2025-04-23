package com.lpu.revise.unit5.generics;


import java.util.ArrayList;
import java.util.List;


class MyMap<K, V>{

}


class MyList<T>{
    private T value;
    int[] arr = new int[10];
    List<T> list = new ArrayList<>();
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }

    public void add(T value){
        list.add(value);
    }

    public T get(int index){
        return list.get(index);
    }
}
public class CustomGenericClassDemo {

    public static void main(String[] args) {

//        MyList list = new MyList();
//        list.setValue("String");
//        list.setValue(10);

        MyList<Integer> list1 = new MyList<>();
        list1.setValue(10);
        System.out.println(list1.getValue());
        list1.add(20);
        list1.get(2);


        MyList<Integer> list2;



        list2 = new MyList<>();
    }
}
