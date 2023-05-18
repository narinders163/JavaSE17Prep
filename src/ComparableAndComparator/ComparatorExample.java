package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Narinder", "Pargat", "Harmanpreet", "Aradhna"));
        names.sort((s1, s2) -> s1.length() > s2.length() ? 1 : -1);
        names.forEach(System.out::println);
    }
}
