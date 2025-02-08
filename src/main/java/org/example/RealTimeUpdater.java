package org.example;

import java.util.List;

public class RealTimeUpdater {

    private final StockMarket stockMarket;

    public RealTimeUpdater(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }

    public void startRealTimeUpdates() {
        while (true) {
            List<StockPrice> allPrices = stockMarket.getAllStockPrices();
            stockMarket.displayPrices(allPrices);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
