package Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Harman");
        list.add("Harman");
        list.add("Narinder");
        list.add("Aradhana");
        list.add("Pargat");
        list.add("Aviraj");
        list.add("Harman");
        list.add(1,"Harman");
        list.forEach(System.out::println);

        System.out.println();

        List <String> list1 = new ArrayList<>();
        list1.add("Harman");
        list1.add("Harman");
        list1.add("Narinder");
        list1.add("Aradhana");
        list1.add("Pargat");
        list1.add("Aviraj");
        list1.add("Harman");
        list1.add(1,"Harman");
        list1.forEach(System.out::println);
    }
}
