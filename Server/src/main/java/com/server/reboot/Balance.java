package com.server.reboot;

import java.math.BigDecimal;

public class Balance {
    private String currency;
    private BigDecimal balance;

    public Balance(String currency, BigDecimal balance){
        this.currency=currency;
        this.balance=balance;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
