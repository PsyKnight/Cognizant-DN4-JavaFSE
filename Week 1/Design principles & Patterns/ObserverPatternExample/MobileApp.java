public class MobileApp implements Observer {
    private String stockId;
    private double stockPrice;

    @Override
    public void update(String stockId, double stockPrice) {
        this.stockId = stockId;
        this.stockPrice = stockPrice;
    }

    @Override
    public void display() {
        System.out.println("\nDisplaying in Mobile: -");
        System.out.println("Stock ID: " + stockId);
        System.out.println("Stock Price: " + stockPrice);
    }
}
