package week2.stock;

import week2.stock.Stocks.StockType;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private StockGrabber stockGrabber;
    private StockType stockType;
    private double price;

    public GetTheStock(StockGrabber stockGrabber, String stockName, double price) {
        this.stockGrabber = stockGrabber;
        this.stockType = StockType.fromString(stockName);
        this.price = price;
    }

    @Override
    public void run() {
        double randNum = (Math.random() * (.1)) - .05;
        DecimalFormat df = new DecimalFormat("#.##");
        price = Double.valueOf(df.format((price + randNum)));

        if (stockType == StockType.APPLE)
            stockGrabber.setApplePrice(price);

        if (stockType == StockType.IBM)
            stockGrabber.setIBMPrice(price);

        if (stockType == StockType.ORACLE)
            stockGrabber.setOraclePrice(price);
    }
}
