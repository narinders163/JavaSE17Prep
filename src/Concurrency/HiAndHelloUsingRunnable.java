package Concurrency;

import java.util.ArrayList;
import java.util.List;

public class HiAndHelloUsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = ()-> {
            for(int i=0; i<=5;i++){
                System.out.println("Hi");
                try {Thread.sleep(500);} catch (InterruptedException e) {}
            }
        };
        Runnable runnable2 = ()-> {
            for(int i=0; i<=5;i++){
                System.out.println("Hello");
                try {Thread.sleep(500);} catch (InterruptedException e) {}
            }
        };
        Thread t1 = new Thread(runnable1,"Hi Thread");
        Thread t2 = new Thread(runnable2,"Hello Thread");
        t1.start();
        try {Thread.sleep(10);} catch (InterruptedException e) {}
        t2.start();
        System.out.println(t2.getName());

    }
}
