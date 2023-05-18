package ReadingJson;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        FileInputStream fis;
        BufferedInputStream bis;
        ObjectInputStream ois;
        try{
            fis = new FileInputStream("./1.ser");
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);
            Object o = ois.readObject();


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

