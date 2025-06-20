import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockId;
    private double stockPrice;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers)
            observer.update(stockId, stockPrice);
    }

    public void setStock(String stockId, double stockPrice) {
        this.stockId = stockId;
        this.stockPrice = stockPrice;
        notifyObserver();
    }
}
