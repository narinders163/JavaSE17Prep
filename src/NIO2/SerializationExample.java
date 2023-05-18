package NIO2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample implements Serializable {
    private static final Long VersionID = 1L;
    private final int age;
    private final String name;
    private final String grade;
    SerializationExample(int age, String name, String grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "SerializationExample{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    public static void main(String[] args) throws IOException {
        List<SerializationExample> family = new ArrayList<>();

        family.add(new SerializationExample(29, "Narinder",
                "Electronics and Communications"));
        family.add(new SerializationExample(30,"Pargat","Mechanical"));
        family.add(new SerializationExample(31,"Aradhana","Masters in Science"));
        family.add(new SerializationExample(25,"Harman","Masters in commerce"));

        serializingObjects(family);

        List<SerializationExample> deserialization = deserialization();
        deserialization.forEach(System.out::println);
    }

    public static void serializingObjects(List<SerializationExample> list) throws FileNotFoundException {
        try(var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("./1.ser")))) {
            for(SerializationExample ser:list){
                out.writeObject(ser);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SerializationExample> deserialization() throws IOException {
        var deserializedObjects = new ArrayList<SerializationExample>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("./1.ser");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            objectInputStream = new ObjectInputStream(bufferedInputStream);
            boolean b = true;
            while (b) {
                Object o = objectInputStream.readObject();
                if (o instanceof SerializationExample ser)
                    deserializedObjects.add(ser);
            }

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            objectInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
            return deserializedObjects;
        }

    }
}
