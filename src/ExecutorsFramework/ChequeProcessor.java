package ExecutorsFramework;

public class ChequeProcessor implements Runnable{
    String name;
    ChequeProcessor(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+" : The chequeprocessor has begun processing : "+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" : The chequeprocessor has finished processing : "+Thread.currentThread().getName());
    }
}
