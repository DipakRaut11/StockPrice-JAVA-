package org.example.broker;

import org.example.StockPrice;
import org.example.StockPriceProvider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BrokerB implements StockPriceProvider {
    @Override
    public List<StockPrice> getPrices() {
        return getPricesFromBrokerB();
    }

    public static List<StockPrice> getPricesFromBrokerB() {
        return Arrays.asList(
                new StockPrice("GOOG", getRandomPrice(), "Broker B"),
                new StockPrice("AMZN", getRandomPrice(), "Broker B")
        );
    }

    private static double getRandomPrice() {
        return 100 + new Random().nextDouble() * 2000;
    }
}
