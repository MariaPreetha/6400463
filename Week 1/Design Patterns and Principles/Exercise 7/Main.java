// File: Main.java
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("InvestMate");
        Observer webApp1 = new WebApp("StockTracker");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(webApp1);

        stockMarket.setStockPrice(105.50);
        stockMarket.setStockPrice(110.75);

        stockMarket.removeObserver(mobileApp1);

        stockMarket.setStockPrice(120.00);
    }
}
