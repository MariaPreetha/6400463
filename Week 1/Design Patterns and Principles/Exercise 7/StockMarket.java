// File: StockMarket.java
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        System.out.println("\nStock price updated to: $" + stockPrice);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer + " registered.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer + " removed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(stockPrice);
        }
    }
}
