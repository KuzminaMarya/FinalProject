package com.server.reboot;

import java.math.BigDecimal;

public class Balance {
    private String currency;
    private int balance;

    public Balance(int balance, String currency){
        this.currency=currency;
        this.balance=balance;
    }

    public String getCurrency() {
        return currency;
    }

    public int getBalance() {
        return balance;
    }
}
