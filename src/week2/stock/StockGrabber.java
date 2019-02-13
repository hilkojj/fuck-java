package week2.stock;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double applePrice;
    private double ibmPrice;
    private double oraclePrice;

    public StockGrabber() {
        // a list to hold all observers
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) { observers.add(newObserver); }
    public void unregister(Observer newObserver) { observers.remove(newObserver); }
    public void notifyObserver() { observers.forEach(obs -> obs.update(ibmPrice, applePrice, oraclePrice)); }

    public void setApplePrice(double newApplePrice) {
        this.applePrice = newApplePrice;
        notifyObserver();
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setOraclePrice(double newOraclePrice) {
        this.oraclePrice = newOraclePrice;
        notifyObserver();
    }
}
