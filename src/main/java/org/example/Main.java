package org.example;


public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        RealTimeUpdater realTimeUpdater = new RealTimeUpdater(stockMarket);
        realTimeUpdater.startRealTimeUpdates();
    }
}