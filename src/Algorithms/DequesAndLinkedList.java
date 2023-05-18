package Algorithms;

import java.sql.SQLOutput;
import java.util.Deque;
import java.util.LinkedList;

public class DequesAndLinkedList {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("Narinder");
        deque.add("Harman");
        deque.add("Pargat");
        deque.add("Aradhna");
        deque.forEach(System.out::println);

        System.out.println();

        deque.removeLast();
        deque.forEach(System.out::println);

        String peek = deque.peek();
        System.out.println();
        System.out.println(peek);
    }
}
