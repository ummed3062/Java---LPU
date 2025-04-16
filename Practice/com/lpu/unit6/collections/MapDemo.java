package com.lpu.unit6.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        Map<String, String> railwayCode = new HashMap<>();
        railwayCode.put("Dl", "Delhi");

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(2, 50);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        System.out.println(map);

        System.out.println(map.getOrDefault(2, 100));

        System.out.println(map.containsKey(2));

        System.out.println(map.entrySet());


        map.putAll(map);

    }
}
