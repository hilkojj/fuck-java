package week2.stock.Stocks;

import week2.stock.Observer;
import week2.stock.Subject;
import week2.stock.View;

public class OracleObserver implements View, Observer {

    private double oraclePrice;

    // static used as a counter
    private static int observerIDTracker = 0;

    // to track the observers
    private int observerID;

    // a reference to concrete subject
    private Subject stockGrabber;

    public OracleObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        stockGrabber.register(this);

        System.out.println("New Observer " + this.observerID);
    }

    // update all observers
    public void update(double ibmPrice, double applePrice, double oraclePrice) {
        this.oraclePrice = oraclePrice;
    }
}
