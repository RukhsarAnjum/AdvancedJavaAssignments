package com.learning.methodref;

import java.util.Currency;

public class LimitOrder extends Order {
    public LimitOrder(String currency, double amount) {
        super(currency, amount);
    }

//    @Override
    public boolean match(Order order) {
        return false;
    }
}