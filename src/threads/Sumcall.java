package threads;

import java.util.concurrent.Callable;

/**
 * Created by DostM on 8/25/2020.
 */
public class Sumcall implements Callable<Integer> {

    int input;

    public Sumcall(int input) {
        this.input = input;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum=0;
        for(int i=0;i<input;i++){
            sum=sum+i;
        }
        return sum;
    }
}
