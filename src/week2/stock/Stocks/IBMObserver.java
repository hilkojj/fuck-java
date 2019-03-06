package week2.stock.Stocks;

import week2.stock.Observer;
import week2.stock.Subject;
import week2.stock.View;

public class IBMObserver implements View, Observer {

    private double ibmPrice;

    // static used as a counter
    private static int observerIDTracker = 0;

    // to track the observers
    private int observerID;

    // a reference to concrete subject
    private Subject stockGrabber;

    public IBMObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        stockGrabber.register(this);

        System.out.println("New Observer " + this.observerID);
    }

    // update all observers
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
    }
}
