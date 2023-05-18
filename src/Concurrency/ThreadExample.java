package Concurrency;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> System.out.println("Hello from Thread");

        Thread t1 = new Thread(r1);
        t1.start();
        t1.join();
        System.out.println("Hello from main");

    }
}
