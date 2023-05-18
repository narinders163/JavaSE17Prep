package Algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Narinder");
        set.add("Pargat");
        set.add("Narinder");
        set.add("Pargat");
        set.add("Aviraj");
        set.add("Baby");
        set.forEach(System.out::println);

        Set<String> setTree = new TreeSet<>();
        setTree.add("Narinder");
        setTree.add("Pargat");
        setTree.add("Narinder");
        setTree.add("Pargat");
        setTree.add("Aviraj");
        setTree.add("Baby");
        setTree.forEach(System.out::println);
    }



}
