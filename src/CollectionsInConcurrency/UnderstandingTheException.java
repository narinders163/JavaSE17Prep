package CollectionsInConcurrency;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingTheException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
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
    }
}
