package StreamOperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MInAndMax {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Narinder");
        list.add("Pargat");
        list.add("Harmanpreet");
        list.add("Aradhna");
        list.add("Aradhna");
        list.add("Aradhna");
        list.add("Pargat");

        list
                .stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        list
                .stream()
                .min((s1, s2) -> s1.length() > s2.length() ? 1 : -1)
                .ifPresent(System.out::println);

        System.out.println();

        Stream
                .iterate(1,n->n+1)
                .skip(5)
                .limit(2)
                .forEach(System.out::println);

    }
}
