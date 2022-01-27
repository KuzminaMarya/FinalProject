package com.server.reboot;

import java.math.BigDecimal;

public class Server {
    public static Balance getBalanceCard(String cardNum){
        return new Balance("RUR", BigDecimal.TEN);
    }
}
