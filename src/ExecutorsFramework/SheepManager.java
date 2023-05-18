package ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {
    private int sheepCount = 0;

    public synchronized void incrementAndReport() {
        System.out.println("The thread started : "+Thread.currentThread().getName()+" printing = "+(++sheepCount));

    }
}
class CountSheeps{
    public static void main(String[] args) {
        SheepManager sheepManager = new SheepManager();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnable = sheepManager::incrementAndReport;
        for (int i=0;i<10;i++) {
            executorService.submit(runnable);
        }
        executorService.shutdown();

    }
}

