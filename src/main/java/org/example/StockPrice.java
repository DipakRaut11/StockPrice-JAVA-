package org.example;

public class StockPrice {
    private final String symbol;
    private final double price;
    private final String source;

    public StockPrice(String symbol, double price, String source) {
        this.symbol = symbol;
        this.price = price;
        this.source = source;
    }

    @Override
    public String toString() {
        return symbol + " - $" + String.format("%.2f", price) + " (" + source + ")";
    }


}
