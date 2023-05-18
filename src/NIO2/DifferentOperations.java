package NIO2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;

public class DifferentOperations {
    public static void main(String[] args) throws IOException {
        Path src = Path.of("C:\\Users\\snari\\newFromJava");
//        Files.createDirectory(src);

        Path destination = Path.of("Documents\\newFromJava");
        Files.deleteIfExists(destination);

//        Files.move(src,destination,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.ATOMIC_MOVE);
    }
}
