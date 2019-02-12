package week1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Opgave30_4 {
    public static int sum = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1000);
        for(int i=0; i<1000; i++)
            executor.submit(new ThreadRunner());
        executor.shutdown();

        System.out.print(sum);
    }
    public static class ThreadRunner implements Runnable {

        @Override
        public void run() {
            sum += 1;
        }
    }
}
