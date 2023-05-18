package Optional;

import java.util.Optional;

public class OptionalExploring {
    public static void main(String[] args) {
        Optional<Integer> multiply = multiply(5, 8, 9, 45);
        multiply.ifPresent(System.out::println);
    }
    public static Optional<Integer> multiply(int... numbers){
        int result = 1;
        for (int number : numbers) {
            if (number == 0)
                throw new RuntimeException("This number is not allowed");
            result = result * number;
        }
        return Optional.of(result);
    }
}
