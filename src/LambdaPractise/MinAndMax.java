package LambdaPractise;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MinAndMax {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Narinder", "Pargat");
        Comparator<? super String> comparator = (String s1, String s2) -> s1.length()-s2.length()>0?1:-1;
        Optional<String> min = names.min(comparator);
        min.ifPresent(System.out::println);
        System.out.println();

        Stream<String> myNames = Stream.of("Narinder", "Narinderpal", "Narinderpal Singh", "Narinderpal","Narinder","Narinder");
//        myNames.distinct().forEach(System.out::println);
        StringBuilder collect = myNames.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(collect);

    }
}
