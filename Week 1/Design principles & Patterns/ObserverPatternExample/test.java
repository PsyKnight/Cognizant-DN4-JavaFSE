public class test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer webApp = new WebApp();
        Observer mobileApp = new MobileApp();

        stockMarket.register(webApp);
        stockMarket.register(mobileApp);

        stockMarket.setStock("Ishanya", 99999999.99);

        webApp.display();
        mobileApp.display();

        stockMarket.setStock("ABC", 0000.00);

        webApp.display();
        mobileApp.display();

    }
}
