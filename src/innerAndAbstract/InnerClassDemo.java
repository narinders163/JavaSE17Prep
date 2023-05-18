package innerAndAbstract;

class Outer{
    public int age = 21;
    public String name = "Unknown";
    public void print(){
        System.out.println(age+" "+ name);
    }

    class Inner{
        public void print(){
            System.out.println("Inside Inner Class Print Method");
        }
    }
    static class Inner2{
        public void print(){
            System.out.println("Inside Static Inner Print Method");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.print();
        Outer.Inner inner = outer.new Inner();
        inner.print();

        Outer.Inner2 outerInner2 = new Outer.Inner2();
        outerInner2.print();
    }
}
