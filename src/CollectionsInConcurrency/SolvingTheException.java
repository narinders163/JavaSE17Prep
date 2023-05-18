package CollectionsInConcurrency;

import java.io.File;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SolvingTheException {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Narinder");
        list.add("Pargat");
        list.add("Aviraj");
        list.add("Harman");
        list.add("Aradhna");
        for(String s:list){
            System.out.println(s);
            if(s.equalsIgnoreCase("Aradhna"))
                list.remove(s);
        }
        System.out.println(list);

        System.out.println(FileSystems.getDefault().getSeparator());
    }
}
