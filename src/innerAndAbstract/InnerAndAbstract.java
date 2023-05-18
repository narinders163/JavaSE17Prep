package innerAndAbstract;
class QE{
    public void show(){
        System.out.println("Knows Java and Selenium");
    }
}
public class InnerAndAbstract {
    public static void main(String[] args) {
        QE qe = new QE(){
          public void show(){
              System.out.println("Manual QE");
          }
        };
        qe.show();
    }
}
