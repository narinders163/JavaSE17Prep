package StreamOperations;

import java.util.stream.Stream;

public class IterateAndSkipLimit {
    public static void main(String[] args) {
        Stream<Integer> iterate = Stream.iterate(1, n -> n + 1);

        iterate
                .skip(5)
                .limit(2)
                .forEach(System.out::println);
    }
}
