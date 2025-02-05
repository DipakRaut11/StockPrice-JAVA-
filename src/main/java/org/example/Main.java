package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        List<StockPrice> stockPrices = stockMarket.getAllStockPrices();


        stockPrices.forEach(System.out::println);

    }
}