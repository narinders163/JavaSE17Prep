package Optional;

import java.util.Optional;

public class FirstOptional {
    public static void main(String[] args) {
        Optional<?> average = average(60,80,55);
        average.ifPresent(System.out::println);
    }
    public static Optional<?> average(int...scores){
        int sum = 0;
        if(scores.length==0) {
            return Optional.empty();
        }
        for(int score:scores) {
            sum += score;
        }
        return Optional.of((double)sum/scores.length);
    }
}
