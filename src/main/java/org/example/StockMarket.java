package org.example;

import org.example.broker.BrokerA;
import org.example.broker.BrokerB;
import org.example.broker.BrokerC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockMarket {
    private final List<StockPriceProvider> providers;

    public StockMarket() {
        providers = Arrays.asList(new BrokerA(), new BrokerB(), new BrokerC());
    }


    public List<StockPrice> getAllStockPrices() {
        List<StockPrice> allPrices = new ArrayList<>();
        for (StockPriceProvider provider : providers) {
            allPrices.addAll(provider.getPrices());
        }
        return allPrices;
    }


    public void displayPrices(List<StockPrice> stockPrices) {
        System.out.println("Real-Time Stock Prices:");
        for (StockPrice stockPrice : stockPrices) {
            System.out.println(stockPrice);
        }
        System.out.println("---------------------------");
    }


}
