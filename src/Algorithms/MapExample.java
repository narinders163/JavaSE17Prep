package Algorithms;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Pargat");
        map.put(2, "Narinder");
        map.put(3, "Daddy");
        map.put(4, "Ariraj");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        entries.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"Aradhna");
        map1.put(2,"Harman");
        map1.put(3,"Mummy");
        map1.put(4,"Baby");

        map1.forEach((k,v) -> map.merge(k,v,(v1,v2)->v1.equalsIgnoreCase(v2)?v1:v1+","+v2));
        System.out.println(map);

        map1.entrySet().forEach(System.out::println);

        System.out.println(map1.isEmpty());

        map1.replaceAll((k,v)-> v.toUpperCase());
        map1.entrySet().forEach(System.out::println);
        System.out.println(map1.size());

    }
}
