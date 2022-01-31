package com.bank.reboot;

import java.math.BigDecimal;

import com.server.reboot.Balance;
import com.server.reboot.Server;


public class Bankomat {
    public static Balance insertCard(Client client){
       return Server.getBalanceCard(client.getCardNum());
    }
}
