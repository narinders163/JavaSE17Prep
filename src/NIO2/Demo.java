package NIO2;

import java.io.*;
import java.nio.file.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) throws IOException {

        Path src = Path.of("C:\\Users\\snari\\Documents\\notes\\Agile_And_Scrum.txt");
//        Files.copy(src,System.out);
//        Path des = Path.of("C:\\Users\\snari\\Documents\\123.txt");
//        Files.copy(src, des, StandardCopyOption.COPY_ATTRIBUTES);
        int nameCount = src.getNameCount();
        System.out.println(nameCount);

        for(int i=0;i<src.getNameCount();i++){
            System.out.println("Element "+ i + " is : " + src.getName(i));
        }
        System.out.println();
        System.out.println(src.subpath(0,3));

        Path subpath = src.subpath(0, 3);
        Path subpath1 = src.subpath(0, 2);

        System.out.println(subpath1);

        Path relativize = subpath.relativize(subpath1);
        System.out.println(relativize);

        Files.lines(src).forEach(System.out::println);


    }
}
