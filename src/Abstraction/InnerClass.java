package Abstraction;

class A{
    public String s = "Hiiiiiiii";
    public void show(){
        System.out.println("In A show");
    }

    class B{
        public void show(){
            System.out.println("In B Show");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        A.B b = a.new B();
        b.show();
    }
}
