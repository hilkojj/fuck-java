package week2.stock;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// the Client
public class StockApp {
    public static void main(String[] args) {

        // create concrete subject
        StockGrabber stockGrabber = new StockGrabber();

        // create and register concrete observer
        StockObserver observer1 = new StockObserver(stockGrabber);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
//        for(int i=0; i<3; i++)
        executor.scheduleAtFixedRate(new GetTheStock(stockGrabber, "name", 1.23d), 0, 3, TimeUnit.SECONDS);

//        executor.shutdown();
    }
}

