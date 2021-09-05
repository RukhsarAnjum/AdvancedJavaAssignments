package com.learning.methodref;

import java.util.Currency;

public class MarketOrder extends Order {
    public MarketOrder(String currency, double amount) {
        super(currency, amount);
    }

    @Override
    public boolean match(Order order) {
        return false;
    }

}