package LambdaPractise;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample extends Object {
    public static void main(String[] args) {
        Stream<Double> randomStream = Stream.generate(Math::random);
        Double aDouble = randomStream.filter(n -> n <= 0.15).findAny().orElse(5.0);
        System.out.println(aDouble);
        List<String> narinder = List.of("Narinder", "Ninda", "Narinderpal");
        List<String> empty = List.of("");
        List<String> pargat = List.of("Pargat", "Pagga");
        Stream<List<String>> combined = Stream.of(narinder, empty, pargat);
        combined.flatMap(Collection::stream).forEach(System.out::println);
    }
}
