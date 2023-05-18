package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo(Student that) {
        return this.age > that.age ?1:-1;
    }
}
public class ImplementingComparable {
    public static void main(String[] args) {

        Student s1 = new Student(12,"Narinder");
        Student s2 = new Student(15,"Harman");
        Student s3 = new Student(4,"Aviraj");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.sort((stud1, stud2) -> stud1.age > stud2.age ? 1 : -1);
        System.out.println(list);

        Collections.sort(list);
        for (Student s: list){
            System.out.println(s);
        }
    }
}
