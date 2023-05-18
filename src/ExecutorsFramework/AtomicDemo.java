package ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        var count = new AtomicInteger();
        Runnable r1 = () -> {
         for(int i=0;i<80000;i++){
             count.getAndIncrement();
         }
       };
        Runnable r2 = () -> {
            for(int i=0;i<20000;i++){
                count.getAndIncrement();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(r1);
        executorService.submit(r2);
        try{
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            executorService.shutdown();
            System.out.println(count);
        }

    }
}
