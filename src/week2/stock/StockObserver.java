package week2.stock;

import javafx.application.Platform;

public class StockObserver implements Observer {
    
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    
    // static used as a counter
    private static int observerIDTracker = 0;
    
    // to track the observers
    private int observerID;
    
    // a reference to concrete subject
    private Subject stockGrabber;
    
    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        stockGrabber.register(this);

        System.out.println("New Observer " + this.observerID);
    }
    
    // update all observers
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");
        Platform.runLater(()->{ StockApp s = StockApp.instance; s.stock1Label.setText(s.stock1String + " " + ibmPrice); s.stock2Label.setText(s.stock2String + " " + aaplPrice); s.stock3Label.setText(s.stock3String + " " + googPrice); });
    }
}
