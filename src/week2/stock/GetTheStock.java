package week2.stock;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private StockGrabber stockGrabber;
    private String stockName;
    private double price;

    public GetTheStock(StockGrabber stockGrabber, String stockName, double price) {
        this.stockGrabber = stockGrabber;
        this.stockName = stockName;
        this.price = price;
    }

    @Override
    public void run() {
        double randNum = (Math.random() * (.1)) - .05;
        DecimalFormat df = new DecimalFormat("#.##");
        price = Double.valueOf(df.format((price + randNum)));

        stockGrabber.setApplePrice(price);
    }
}
