package ExecutorsFramework;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {
    int num;
    CallableExample(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" : is calculating the sum of numbers upto : "+num);
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}
