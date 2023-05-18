package ParallelStream;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
//        List<String> names = List.of("Narinder", "Pargat", "a", "b", "c", "d", "Aviraj");

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=10;i++){
            StringBuilder c = sb.append("c");
            String string = c.toString();
            copyOnWriteArrayList.add(string);
        }
        copyOnWriteArrayList.forEach(System.out::println);

        copyOnWriteArrayList.parallelStream().forEach(System.out::println);
    }
}
