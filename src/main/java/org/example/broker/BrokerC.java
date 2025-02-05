package org.example.broker;

import org.example.StockPrice;
import org.example.StockPriceProvider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BrokerC implements StockPriceProvider {
    @Override
    public List<StockPrice> getPrices() {
        return getPricesFromBrokerC();
    }

    public static List<StockPrice> getPricesFromBrokerC() {
        return Arrays.asList(
                new StockPrice("TSLA", getRandomPrice(), "Broker C"),
                new StockPrice("NFLX", getRandomPrice(), "Broker C")
        );
    }

    private static double getRandomPrice() {
        return 100 + new Random().nextDouble() * 2000;
    }
}
