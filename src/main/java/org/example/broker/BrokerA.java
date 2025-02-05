package org.example.broker;

import org.example.StockPrice;
import org.example.StockPriceProvider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BrokerA implements StockPriceProvider {
    @Override
    public List<StockPrice> getPrices() {
        return getPricesFromBrokerA();
    }

    public static List<StockPrice> getPricesFromBrokerA() {
        return Arrays.asList(
                new StockPrice("AAPL", getRandomPrice(), "Broker A"),
                new StockPrice("MSFT", getRandomPrice(), "Broker A")
        );
    }

    private static double getRandomPrice() {
        return 100 + new Random().nextDouble() * 2000;
    }
}
