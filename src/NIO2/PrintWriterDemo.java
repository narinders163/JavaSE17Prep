package NIO2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterDemo {
    public static void main(String[] args) {
       try(Writer wr = new FileWriter("./1.txt");
               PrintWriter writer = new PrintWriter(wr)){
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
