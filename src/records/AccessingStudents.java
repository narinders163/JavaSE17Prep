package records;

public class AccessingStudents {
    public static void main(String[] args) {
        Students s = new Students("Narinder","Java",29);
        System.out.println(s);
        Students students = new Students("Pargat","CadCam",30);
        System.out.println(students);

        Students s2 = new Students("Narinderpal","Singh");
        System.out.println(s2);
        s2.IQ();
    }
}
