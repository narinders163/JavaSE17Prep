package ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsClassForProcessingChecques {
    public static void main(String[] args) throws InterruptedException {
        ChequeProcessor[] chequeProcessor = {
                new ChequeProcessor("ATM"),
                new ChequeProcessor("Mobile"),
                new ChequeProcessor("Teller"),
                new ChequeProcessor("Computer"),
                new ChequeProcessor("ATM2"),
                new ChequeProcessor("Teller2"),
                new ChequeProcessor("Teller3"),
                new ChequeProcessor("Teller4"),
                new ChequeProcessor("Mobile2")
        };

        ExecutorService executorService = Executors.newFixedThreadPool(9);
        try{
            for(ChequeProcessor chp:chequeProcessor){
                executorService.submit(chp);
            }
        }finally {
            executorService.shutdown();
        }

        boolean b = executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(b);
        if(executorService.isTerminated())
            System.out.println("Finished");
        else
            System.out.println("One task is still running");

    }

}
