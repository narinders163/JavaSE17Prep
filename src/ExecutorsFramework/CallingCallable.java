package ExecutorsFramework;

import java.util.concurrent.*;

public class CallingCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableExample[] callableExamples = {new CallableExample(5897548),
                new CallableExample(25),
                new CallableExample(4),
                new CallableExample(7),
                new CallableExample(9)};

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try{
            for(CallableExample ce:callableExamples){
                Future<Integer> future = executorService.submit(ce);
                    Integer integer = future.get();
                    System.out.println("Sum is : "+integer);
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }

        CallableExample callableExample = new CallableExample(7);
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> schedule = scheduledExecutorService.schedule(callableExample, 10, TimeUnit.SECONDS);
        Integer integer = schedule.get();
        System.out.println("Sum is : "+integer);

        scheduledExecutorService.shutdown();
    }
}
